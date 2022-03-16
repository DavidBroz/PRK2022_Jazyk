// Generated from Fn.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FnParser}.
 */
public interface FnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FnParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FnParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FnParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FnParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FnParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(FnParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(FnParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#operant}.
	 * @param ctx the parse tree
	 */
	void enterOperant(FnParser.OperantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#operant}.
	 * @param ctx the parse tree
	 */
	void exitOperant(FnParser.OperantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(FnParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(FnParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(FnParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(FnParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(FnParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(FnParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(FnParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(FnParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#nestpower}.
	 * @param ctx the parse tree
	 */
	void enterNestpower(FnParser.NestpowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#nestpower}.
	 * @param ctx the parse tree
	 */
	void exitNestpower(FnParser.NestpowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(FnParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(FnParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(FnParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(FnParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#comparation}.
	 * @param ctx the parse tree
	 */
	void enterComparation(FnParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#comparation}.
	 * @param ctx the parse tree
	 */
	void exitComparation(FnParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#operant_comp}.
	 * @param ctx the parse tree
	 */
	void enterOperant_comp(FnParser.Operant_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#operant_comp}.
	 * @param ctx the parse tree
	 */
	void exitOperant_comp(FnParser.Operant_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#boolean_comp}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_comp(FnParser.Boolean_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#boolean_comp}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_comp(FnParser.Boolean_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link FnParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(FnParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FnParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(FnParser.If_statementContext ctx);
}