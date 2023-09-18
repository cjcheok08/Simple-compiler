import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PythonPprintVisitor extends ExprBaseVisitor<String> {

    Map<String, Symbol> symbolTable = new HashMap<String, Symbol>();
    Stack<Map<String, Symbol>> localSymbolTables = new Stack<>();


    @Override
    public String visitProg(ExprParser.ProgContext ctx) {
        StringBuilder str = new StringBuilder();
        String temp = "";
        for (int i = 0; i < ctx.stat().size(); i++) {
            temp = this.visit(ctx.stat().get(i));
            if (temp != null) {
                str.append(temp).append("\n");   // outputs only if result not null
            }
        }
        return str.toString();

    }

    @Override
    public String visitPrintStat(ExprParser.PrintStatContext ctx) {
        return "print(" + this.visit(ctx.expr()) + ")";
    }

    @Override
    public String visitAssignStat(ExprParser.AssignStatContext ctx) {
        String assign = ctx.ASSIGN().getText();
        String id = ctx.ID().getText();
        String val = this.visit(ctx.expr());
        String type;

        if (symbolTable.containsKey(id)) {  // check if variable already declared, only allow without type
            if (ctx.type() != null) {  // checks if 'type' is not in the text
                throw new RuntimeException("Multiple declarations error: Variable '" + id +
                                            "' has already been declared");
            }
            type = symbolTable.get(id).getType();
        } else if (!localSymbolTables.isEmpty() && localSymbolTables.get(0).containsKey(id)){
            type = localSymbolTables.get(0).get(id).getType();
        } else {
            if (ctx.type() == null) {
                throw new RuntimeException("Undeclared variable error: Variable '" + id + "' has not been declared yet, data type should be included");
            }
            type = this.visit(ctx.type());
        }

        // compares var type with each value's type, if var type 'int' and any one value is not 'int', throw an error
        String[] valList = val.split("[*/%+-]");
        for (String r : valList) {
            String valType = checkDataType(r.trim());
            if (type.equals("int") && !type.equals(valType)) {
                throw new RuntimeException("Type mismatch error: int '" + id + "' cannot be assigned with float '" + val + "'");
            }
        }
        Symbol var = new Symbol(type, val);
        symbolTable.put(id, var);
        return id + " " + assign + " " + val;
    }

    @Override
    public String visitDeclareStat(ExprParser.DeclareStatContext ctx) {
        String type = this.visit(ctx.type());
        String id = ctx.ID().getText();

        //if var not already declared, then allow; else throw an exception
        if (symbolTable.containsKey(id) || (!localSymbolTables.isEmpty() && localSymbolTables.get(0).containsKey(id))) {  // check if variable already declared, only allow without type
            throw new RuntimeException("Multiple declarations error: Variable '" + id + "' has already been declared");
        }
        Symbol var = new Symbol(type, null);
        symbolTable.put(id, var);
        return null;
    }

    @Override
    public String visitType(ExprParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override //puts the local argument into local symbol table
    public String visitArg(ExprParser.ArgContext ctx) {
        String type = this.visit(ctx.type());
        String id = ctx.ID().getText();
        Symbol var = new Symbol(type, null);
        localSymbolTables.get(0).put(id, var);
        return id;
    }


    @Override //pushes a local symbol table for the current scope into Stack, pops it after its block is error checked
    public String visitDefineFunction(ExprParser.DefineFunctionContext ctx) {
        Map<String, Symbol> localST = new HashMap<String, Symbol>();
        localSymbolTables.push(localST);

        String define = ctx.DEF().getText();
        String funcName = ctx.ID().getText();
        StringBuilder args = new StringBuilder();
        StringBuilder argTypes = new StringBuilder();
        String comma = "";
        for (int i = 0; i < ctx.arg().size(); i++) {
            String arg = this.visit(ctx.arg().get(i));
            args.append(comma).append(arg);
            argTypes.append(comma).append(localSymbolTables.get(0).get(arg).getType());
            comma = ", ";
        }
        String block = this.visit(ctx.block());
        block = block.replace("\n", "\n\t");
        Symbol func = new Symbol(argTypes.toString(), args.toString());
        symbolTable.put(funcName + "()", func);
        localSymbolTables.pop();
        return define + " " + funcName + "(" + args + ")" +":" + block;
    }

    @Override // checks global symbol table for funcName first
    public String visitCallFunction(ExprParser.CallFunctionContext ctx) {
        String funcName = ctx.ID().getText() + "()";
        if (symbolTable.get(funcName) == null) {
            throw new RuntimeException("Undefined function error: Function '" + funcName + "' has not been defined");
        }
        String[] argTypes = symbolTable.get(funcName).getType().split(", ");
        if (ctx.atom().size() == 0) {
            String str = ctx.getText().replace(",",", ").replace("\r\n", "");
            return str;
        }

        if (argTypes.length == ctx.atom().size()) {
            for (int i = 0; i < argTypes.length; i++) {
                String atomType = checkDataType(ctx.atom(i).getText());

                if (argTypes[i].equals(atomType)){
                } else {
                    throw new RuntimeException("Incorrect arguments error: Argument types do not match function '" + funcName + "'");
                }
            }

        } else {
            throw new RuntimeException("Incorrect arguments error: Number of arguments do not match function '" + funcName + "'");
        }
        String str = ctx.getText().replace(",",", ").replace("\r\n", "");
        return str; // Removes the newline at the end
    }

    @Override //Type mismatch checking (eg. 1 * 2.5) handled by assignStat because this expression is valid for float var
    public String visitMulDivMod(ExprParser.MulDivModContext ctx) {
        String op = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + op + " " + right;
    }

    @Override //Type mismatch checking (eg. 1 + 2.5) handled by assignStat because this expression is valid for float var
    public String visitAddSub(ExprParser.AddSubContext ctx) {
        String op = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + op + " " + right;
    }

    @Override
    public String visitArithAssignStat(ExprParser.ArithAssignStatContext ctx) {
        return this.visit(ctx.arithAssign());
    }

    @Override // runs checks like assignStat
    public String visitArithAssign(ExprParser.ArithAssignContext ctx) {
        String op = ctx.op.getText();
        String id = ctx.left.getText();
        String right = this.visit(ctx.right);
        if (symbolTable.containsKey(id) && symbolTable.get(id).getVal() == null) {
            throw new RuntimeException("Unassigned variable error: Variable '" + id + "' has been declared " +
                    "but not initialized with a value");
        }
        if (symbolTable.containsKey(id) || (!localSymbolTables.isEmpty() && localSymbolTables.get(0).containsKey(id))) {
            String idType = checkDataType(id);
            String[] rightList = right.split("[*/%+-]");
            for (String r : rightList) {
                String rightType = checkDataType(r.trim());
                if (idType.equals("int") && !idType.equals(rightType)) {
                    throw new RuntimeException("Type mismatch error: int '" + id + "' cannot be assigned with float '"
                            + right + "'");
                }
            }

            return id + " " + op + " " + right;
        } else {
            throw new RuntimeException("Undeclared variable error: Variable '" + id + "' has not been declared");
        }
    }

    @Override
    public String visitAtomExpr(ExprParser.AtomExprContext ctx) {
        return this.visit(ctx.atom());
    }

    @Override
    public String visitInt(ExprParser.IntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitFloat(ExprParser.FloatContext ctx) {
        return ctx.FLOAT().getText();
    }

    public String visitNegativeNum(ExprParser.NegativeNumContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitId(ExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (symbolTable.containsKey(id)) { // checks if variable was declared
            if (symbolTable.get(id).getVal() == null) { // checks if variable was declared but not initialized
                throw new RuntimeException("Unassigned variable error: Variable '" + id + "' has been declared " +
                        "but not initialized with a value");
            }
            return ctx.ID().getText();
        } else if (!localSymbolTables.isEmpty() && localSymbolTables.get(0).containsKey(id)) { //checks if var in arguments
            return ctx.ID().getText();
        } else {
            throw new RuntimeException("Undeclared variable error: Variable '" + id + "' was not declared");
        }
    }

    @Override
    public String visitParen(ExprParser.ParenContext ctx) {
        String lParen = ctx.LPAREN().getText();
        String rParen = ctx.RPAREN().getText();
        return lParen + this.visit(ctx.expr()) + rParen;
    }

    @Override
    public String visitIfElseStat(ExprParser.IfElseStatContext ctx) {
        String ifStr = ctx.IF().getText();
        String elseStr = ctx.ELSE().getText();
        String condition = this.visit(ctx.condition);
        String thenBlock = this.visit(ctx.thenBlock);
        String elseBlock = this.visit(ctx.elseBlock);
        thenBlock = thenBlock.replace("\n", "\n\t");
        elseBlock = elseBlock.replace("\n", "\n\t");
        return ifStr + " " + condition + ":" + thenBlock + "\n" + elseStr + ":" + elseBlock;
    }

    @Override
    public String visitIfThenStat(ExprParser.IfThenStatContext ctx) {
        String str = ctx.IF().getText();
        String condition = this.visit(ctx.condition);
        String block = this.visit(ctx.thenBlock);
        block = block.replace("\n", "\n\t");
        return str + " " + condition + ":" + block;
    }


    @Override
    public String visitWhileStat(ExprParser.WhileStatContext ctx) {
        String str = ctx.WHILE().getText();
        String condition = this.visit(ctx.condition);
        String block = this.visit(ctx.block());
        block = block.replace("\n", "\n\t");
        return str + " " + condition + ":" + block;
    }

    @Override
    public String visitBlock(ExprParser.BlockContext ctx) {
        String str = "";
        for (int i = 0; i < ctx.stat().size(); i++) {
            str += "\n" + this.visit(ctx.stat().get(i));
        }
        return str;
    }

    @Override
    public String visitEquals(ExprParser.EqualsContext ctx) {
        String equals = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + equals + " " + right;
    }

    @Override
    public String visitNotEquals(ExprParser.NotEqualsContext ctx) {
        String notEquals = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + notEquals + " " + right;
    }

    @Override
    public String visitGreater(ExprParser.GreaterContext ctx) {
        String greater = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + greater + " " + right;
    }

    @Override
    public String visitLess(ExprParser.LessContext ctx) {
        String less = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + less + " " + right;
    }

    @Override
    public String visitGreaterEquals(ExprParser.GreaterEqualsContext ctx) {
        String greatEq = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + greatEq + " " + right;
    }

    @Override
    public String visitLessEquals(ExprParser.LessEqualsContext ctx) {
        String lessEq = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + lessEq + " " + right;
    }

    @Override
    public String visitBoolParen(ExprParser.BoolParenContext ctx) {
        return this.visit(ctx.boolExpr());
    }

    @Override
    public String visitAnd(ExprParser.AndContext ctx) {
        String and = "and";
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + and + " " + right;
    }

    @Override
    public String visitOr(ExprParser.OrContext ctx) {
        String or = "or";
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return left + " " + or + " " + right;
    }

    public boolean checkInt(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public boolean checkFloat(String val) {
        try {
            Double.parseDouble(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String checkDataType(String str) {   // Used to check data type of variables and number values
        if (symbolTable.containsKey(str)) {
            return symbolTable.get(str).getType();
        } else {
            if (checkInt(str)) {
                return "int";
            } else if (checkFloat(str)) {
                return "float";
            } else {
                return "expr";
            }
        }
    }

}