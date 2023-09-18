// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStat(ExprParser.IfElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStat(ExprParser.IfElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStat(ExprParser.IfThenStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStat(ExprParser.IfThenStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(ExprParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(ExprParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStat(ExprParser.DeclareStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStat(ExprParser.DeclareStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithAssignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterArithAssignStat(ExprParser.ArithAssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithAssignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitArithAssignStat(ExprParser.ArithAssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunction(ExprParser.DefineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunction(ExprParser.DefineFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(ExprParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(ExprParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ExprParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ExprParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arithAssign}.
	 * @param ctx the parse tree
	 */
	void enterArithAssign(ExprParser.ArithAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arithAssign}.
	 * @param ctx the parse tree
	 */
	void exitArithAssign(ExprParser.ArithAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(ExprParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(ExprParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessEquals(ExprParser.LessEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessEquals(ExprParser.LessEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ExprParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ExprParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(ExprParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(ExprParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEquals(ExprParser.GreaterEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEquals(ExprParser.GreaterEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(ExprParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(ExprParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolParen}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolParen(ExprParser.BoolParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolParen}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolParen(ExprParser.BoolParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterLess(ExprParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitLess(ExprParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greater}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreater(ExprParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreater(ExprParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(ExprParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(ExprParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(ExprParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(ExprParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ExprParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ExprParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeNum}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNegativeNum(ExprParser.NegativeNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeNum}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNegativeNum(ExprParser.NegativeNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ExprParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprParser.IdContext ctx);
}