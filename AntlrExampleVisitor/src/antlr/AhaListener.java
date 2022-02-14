// Generated from Aha.g4 by ANTLR 4.9.2

	package antlr; 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AhaParser}.
 */
public interface AhaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AhaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AhaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AhaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AhaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AhaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AhaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AhaParser.ExprContext ctx);
}