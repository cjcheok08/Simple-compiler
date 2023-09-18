// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStat(ExprParser.IfElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStat(ExprParser.IfThenStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(ExprParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStat(ExprParser.DeclareStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithAssignStat}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAssignStat(ExprParser.ArithAssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineFunction(ExprParser.DefineFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunction}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(ExprParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(ExprParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arithAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAssign(ExprParser.ArithAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ExprParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEquals(ExprParser.LessEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ExprParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(ExprParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEquals(ExprParser.GreaterEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEquals}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(ExprParser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolParen}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParen(ExprParser.BoolParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(ExprParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greater}
	 * labeled alternative in {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(ExprParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ExprParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(ExprParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ExprParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeNum}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeNum(ExprParser.NegativeNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ExprParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
}