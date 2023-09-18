import javax.swing.tree.DefaultMutableTreeNode;

public class DisplayASTVisitor extends ExprBaseVisitor<DefaultMutableTreeNode> {
    private DefaultMutableTreeNode progNode;

    public DisplayASTVisitor(DefaultMutableTreeNode progNode) {
        this.progNode = progNode;
    }

    @Override
    public DefaultMutableTreeNode visitProg(ExprParser.ProgContext ctx) {
        for (int i = 0; i < ctx.stat().size(); i++) {
            progNode.add(this.visit(ctx.stat(i)));
        }
        return progNode;
    }

    @Override
    public DefaultMutableTreeNode visitPrintStat(ExprParser.PrintStatContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public DefaultMutableTreeNode visitAssignStat(ExprParser.AssignStatContext ctx) {
        DefaultMutableTreeNode assignNode = new DefaultMutableTreeNode(ctx.ASSIGN().getText());
        DefaultMutableTreeNode idNode = new DefaultMutableTreeNode(ctx.ID().getText());
        //assignNode.add(idNode);
        if (ctx.type() != null) {
            DefaultMutableTreeNode typeNode = new DefaultMutableTreeNode(ctx.type().getText());
            typeNode.add(idNode);
            assignNode.add(typeNode);
        } else {
            assignNode.add(idNode);
        }
        assignNode.add(this.visit(ctx.expr()));
        return assignNode;
    }

    @Override
    public DefaultMutableTreeNode visitDeclareStat(ExprParser.DeclareStatContext ctx) {
        DefaultMutableTreeNode declareNode = new DefaultMutableTreeNode(ctx.type().getText());
        DefaultMutableTreeNode idNode = new DefaultMutableTreeNode(ctx.ID().getText());
        declareNode.add(idNode);
        return declareNode;
    }

    @Override
    public DefaultMutableTreeNode visitDefineFunction(ExprParser.DefineFunctionContext ctx) {
        DefaultMutableTreeNode defineFuncNode = new DefaultMutableTreeNode(ctx.DEF().getText());
        DefaultMutableTreeNode funcNameNode = new DefaultMutableTreeNode(ctx.ID().getText() + "()");
        defineFuncNode.add(funcNameNode);
        for (int i = 0; i < ctx.arg().size(); i++) {
            defineFuncNode.add(this.visit(ctx.arg(i)));
        }
        DefaultMutableTreeNode blockNode = this.visit(ctx.block());
        defineFuncNode.add(blockNode);
        return defineFuncNode;
    }

    @Override
    public DefaultMutableTreeNode visitCallFunction(ExprParser.CallFunctionContext ctx) {
        DefaultMutableTreeNode callFuncNode = new DefaultMutableTreeNode(ctx.ID().getText() + "()");
        for (int i = 0; i < ctx.atom().size(); i++) {
            callFuncNode.add(this.visit(ctx.atom(i)));
        }
        return callFuncNode;
    }

    @Override
    public DefaultMutableTreeNode visitArg(ExprParser.ArgContext ctx) {
        DefaultMutableTreeNode argTypeNode = this.visit(ctx.type());
        DefaultMutableTreeNode idNode = new DefaultMutableTreeNode(ctx.ID().getText());
        argTypeNode.add(idNode);
        return argTypeNode;
    }

    @Override
    public DefaultMutableTreeNode visitType(ExprParser.TypeContext ctx) {
        DefaultMutableTreeNode typeNode = new DefaultMutableTreeNode(ctx.getText());
        return typeNode;
    }

    @Override
    public DefaultMutableTreeNode visitArithAssignStat(ExprParser.ArithAssignStatContext ctx) {
        return this.visit(ctx.arithAssign());
    }

    @Override
    public DefaultMutableTreeNode visitArithAssign(ExprParser.ArithAssignContext ctx) {
        DefaultMutableTreeNode opNode = new DefaultMutableTreeNode(ctx.op.getText());
        DefaultMutableTreeNode idNode = new DefaultMutableTreeNode(ctx.ID().getText());
        opNode.add(idNode);
        opNode.add(this.visit(ctx.expr()));
        return opNode;
    }

    @Override
    public DefaultMutableTreeNode visitMulDivMod(ExprParser.MulDivModContext ctx) {
        DefaultMutableTreeNode mulDivModNode = new DefaultMutableTreeNode(ctx.op.getText());
        for (int i = 0; i < ctx.expr().size(); i++) {
            mulDivModNode.add(this.visit(ctx.expr(i)));
        }
        return mulDivModNode;
    }

    @Override
    public DefaultMutableTreeNode visitAddSub(ExprParser.AddSubContext ctx) {
        DefaultMutableTreeNode addSubNode = new DefaultMutableTreeNode(ctx.op.getText());
        for (int i = 0; i < ctx.expr().size(); i++) {
            addSubNode.add(this.visit(ctx.expr(i)));
        }
        return addSubNode;
    }

    @Override
    public DefaultMutableTreeNode visitInt(ExprParser.IntContext ctx) {
        return new DefaultMutableTreeNode(ctx.INT().getText());
    }

    @Override
    public DefaultMutableTreeNode visitFloat(ExprParser.FloatContext ctx) {
        return new DefaultMutableTreeNode(ctx.FLOAT().getText());
    }

    @Override
    public DefaultMutableTreeNode visitNegativeNum(ExprParser.NegativeNumContext ctx) {
        return new DefaultMutableTreeNode(ctx.getText());
    }

    @Override
    public DefaultMutableTreeNode visitId(ExprParser.IdContext ctx) {
        return new DefaultMutableTreeNode(ctx.ID().getText());
    }

    @Override
    public DefaultMutableTreeNode visitParen(ExprParser.ParenContext ctx) {
        DefaultMutableTreeNode parenNode = new DefaultMutableTreeNode(ctx.LPAREN().getText() +
                                                                            ctx.RPAREN().getText());
        parenNode.add(this.visit(ctx.expr()));
        return parenNode;
    }

    @Override
    public DefaultMutableTreeNode visitIfElseStat(ExprParser.IfElseStatContext ctx) {
        DefaultMutableTreeNode ifNode = new DefaultMutableTreeNode(ctx.IF().getText());
        DefaultMutableTreeNode parenNode = new DefaultMutableTreeNode(ctx.LPAREN().getText() +
                                                                                ctx.RPAREN().getText());
        DefaultMutableTreeNode conditionNode = this.visit(ctx.condition);
        DefaultMutableTreeNode thenNode = this.visit(ctx.thenBlock);
        DefaultMutableTreeNode elseStrNode = new DefaultMutableTreeNode(ctx.ELSE().getText());
        DefaultMutableTreeNode elseNode = this.visit(ctx.elseBlock);
        ifNode.add(parenNode);
        parenNode.add(conditionNode);
        ifNode.add(thenNode);
        ifNode.add(elseStrNode);
        elseStrNode.add(elseNode);
        return ifNode;
    }

    @Override
    public DefaultMutableTreeNode visitIfThenStat(ExprParser.IfThenStatContext ctx) {
        DefaultMutableTreeNode ifNode = new DefaultMutableTreeNode(ctx.IF().getText());
        DefaultMutableTreeNode parenNode = new DefaultMutableTreeNode(ctx.LPAREN().getText() +
                                                                                ctx.RPAREN().getText());
        DefaultMutableTreeNode conditionNode = this.visit(ctx.condition);
        DefaultMutableTreeNode thenNode = this.visit(ctx.thenBlock);
        ifNode.add(parenNode);
        parenNode.add(conditionNode);
        ifNode.add(thenNode);
        return ifNode;
    }

    @Override
    public DefaultMutableTreeNode visitWhileStat(ExprParser.WhileStatContext ctx) {
        DefaultMutableTreeNode whileNode = new DefaultMutableTreeNode(ctx.WHILE().getText());
        DefaultMutableTreeNode parenNode = new DefaultMutableTreeNode(ctx.LPAREN().getText() +
                ctx.RPAREN().getText());
        DefaultMutableTreeNode conditionNode = this.visit(ctx.condition);
        DefaultMutableTreeNode doNode = this.visit(ctx.block());
        whileNode.add(parenNode);
        parenNode.add(conditionNode);
        whileNode.add(doNode);
        return whileNode;
    }

    @Override
    public DefaultMutableTreeNode visitBlock(ExprParser.BlockContext ctx) {
        DefaultMutableTreeNode blockNode = new DefaultMutableTreeNode(ctx.LBRAC().getText() +
                                                                            ctx.RBRAC().getText());
        for (int i = 0; i < ctx.stat().size(); i++) {
            blockNode.add(this.visit(ctx.stat(i)));
        }
        return blockNode;

    }

    @Override
    public DefaultMutableTreeNode visitEquals(ExprParser.EqualsContext ctx) {
        DefaultMutableTreeNode equalsNode = new DefaultMutableTreeNode(ctx.op.getText());
        equalsNode.add(this.visit(ctx.left));
        equalsNode.add(this.visit(ctx.right));
        return equalsNode;
    }

    @Override
    public DefaultMutableTreeNode visitNotEquals(ExprParser.NotEqualsContext ctx) {
        DefaultMutableTreeNode notEqualsNode = new DefaultMutableTreeNode(ctx.op.getText());
        notEqualsNode.add(this.visit(ctx.left));
        notEqualsNode.add(this.visit(ctx.right));
        return notEqualsNode;
    }

    @Override
    public DefaultMutableTreeNode visitGreater(ExprParser.GreaterContext ctx) {
        DefaultMutableTreeNode greaterNode = new DefaultMutableTreeNode(ctx.op.getText());
        greaterNode.add(this.visit(ctx.left));
        greaterNode.add(this.visit(ctx.right));
        return greaterNode;
    }

    @Override
    public DefaultMutableTreeNode visitLess(ExprParser.LessContext ctx) {
        DefaultMutableTreeNode lessNode = new DefaultMutableTreeNode(ctx.op.getText());
        lessNode.add(this.visit(ctx.left));
        lessNode.add(this.visit(ctx.right));
        return lessNode;
    }

    @Override
    public DefaultMutableTreeNode visitGreaterEquals(ExprParser.GreaterEqualsContext ctx) {
        DefaultMutableTreeNode greatEqNode = new DefaultMutableTreeNode(ctx.op.getText());
        greatEqNode.add(this.visit(ctx.left));
        greatEqNode.add(this.visit(ctx.right));
        return greatEqNode;
    }

    @Override
    public DefaultMutableTreeNode visitLessEquals(ExprParser.LessEqualsContext ctx) {
        DefaultMutableTreeNode lessEqNode = new DefaultMutableTreeNode(ctx.op.getText());
        lessEqNode.add(this.visit(ctx.left));
        lessEqNode.add(this.visit(ctx.right));
        return lessEqNode;
    }

    @Override
    public DefaultMutableTreeNode visitBoolParen(ExprParser.BoolParenContext ctx) {
        DefaultMutableTreeNode parenNode = new DefaultMutableTreeNode(ctx.LPAREN().getText() +
                ctx.RPAREN().getText());
        parenNode.add(this.visit(ctx.boolExpr()));
        return parenNode;
    }

    @Override
    public DefaultMutableTreeNode visitAnd(ExprParser.AndContext ctx) {
        DefaultMutableTreeNode andNode = new DefaultMutableTreeNode(ctx.op.getText());
        andNode.add(this.visit(ctx.left));
        andNode.add(this.visit(ctx.right));
        return andNode;
    }

    @Override
    public DefaultMutableTreeNode visitOr(ExprParser.OrContext ctx) {
        DefaultMutableTreeNode orNode = new DefaultMutableTreeNode(ctx.op.getText());
        orNode.add(this.visit(ctx.left));
        orNode.add(this.visit(ctx.right));
        return orNode;
    }
}
