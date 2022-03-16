// Generated from Fn.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BOOLEAN=18, NUMBER=19, WHITESPACE=20, NEWLINE=21;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_operation = 2, RULE_operant = 3, 
		RULE_parentheses = 4, RULE_mult = 5, RULE_add = 6, RULE_power = 7, RULE_nestpower = 8, 
		RULE_fraction = 9, RULE_integer = 10, RULE_comparation = 11, RULE_operant_comp = 12, 
		RULE_boolean_comp = 13, RULE_if_statement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "operation", "operant", "parentheses", "mult", 
			"add", "power", "nestpower", "fraction", "integer", "comparation", "operant_comp", 
			"boolean_comp", "if_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'+'", "'^'", "'^@'", "'['", "'|'", "']'", 
			"'0'", "'<'", "'>'", "'=='", "'if'", "'{'", "'}'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEAN", "NUMBER", "WHITESPACE", 
			"NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Fn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(32);
				operation();
				}
				break;
			case 2:
				{
				setState(33);
				parentheses();
				}
				break;
			case 3:
				{
				setState(34);
				if_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public NestpowerContext nestpower() {
			return getRuleContext(NestpowerContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				mult();
				}
				break;
			case 2:
				{
				setState(38);
				add();
				}
				break;
			case 3:
				{
				setState(39);
				power();
				}
				break;
			case 4:
				{
				setState(40);
				nestpower();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperantContext extends ParserRuleContext {
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public OperantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterOperant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitOperant(this);
		}
	}

	public final OperantContext operant() throws RecognitionException {
		OperantContext _localctx = new OperantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(43);
				fraction();
				}
				break;
			case T__9:
			case NUMBER:
				{
				setState(44);
				integer();
				}
				break;
			case T__0:
				{
				setState(45);
				parentheses();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesesContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitParentheses(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			expression();
			setState(50);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public List<OperantContext> operant() {
			return getRuleContexts(OperantContext.class);
		}
		public OperantContext operant(int i) {
			return getRuleContext(OperantContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			operant();
			setState(53);
			match(T__2);
			setState(54);
			operant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public List<OperantContext> operant() {
			return getRuleContexts(OperantContext.class);
		}
		public OperantContext operant(int i) {
			return getRuleContext(OperantContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			operant();
			setState(57);
			match(T__3);
			setState(58);
			operant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public OperantContext operant() {
			return getRuleContext(OperantContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			operant();
			setState(61);
			match(T__4);
			setState(62);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestpowerContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public NestpowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestpower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterNestpower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitNestpower(this);
		}
	}

	public final NestpowerContext nestpower() throws RecognitionException {
		NestpowerContext _localctx = new NestpowerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nestpower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			integer();
			setState(65);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionContext extends ParserRuleContext {
		public List<OperantContext> operant() {
			return getRuleContexts(OperantContext.class);
		}
		public OperantContext operant(int i) {
			return getRuleContext(OperantContext.class,i);
		}
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitFraction(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			operant();
			setState(69);
			match(T__7);
			setState(70);
			operant();
			setState(71);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FnParser.NUMBER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparationContext extends ParserRuleContext {
		public Operant_compContext operant_comp() {
			return getRuleContext(Operant_compContext.class,0);
		}
		public Boolean_compContext boolean_comp() {
			return getRuleContext(Boolean_compContext.class,0);
		}
		public ComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitComparation(this);
		}
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__6:
			case T__9:
			case NUMBER:
				{
				setState(75);
				operant_comp();
				}
				break;
			case BOOLEAN:
				{
				setState(76);
				boolean_comp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operant_compContext extends ParserRuleContext {
		public List<OperantContext> operant() {
			return getRuleContexts(OperantContext.class);
		}
		public OperantContext operant(int i) {
			return getRuleContext(OperantContext.class,i);
		}
		public Operant_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operant_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterOperant_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitOperant_comp(this);
		}
	}

	public final Operant_compContext operant_comp() throws RecognitionException {
		Operant_compContext _localctx = new Operant_compContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operant_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			operant();
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			operant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_compContext extends ParserRuleContext {
		public List<TerminalNode> BOOLEAN() { return getTokens(FnParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(FnParser.BOOLEAN, i);
		}
		public Boolean_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterBoolean_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitBoolean_comp(this);
		}
	}

	public final Boolean_compContext boolean_comp() throws RecognitionException {
		Boolean_compContext _localctx = new Boolean_compContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BOOLEAN);
			setState(84);
			match(T__12);
			setState(85);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(FnParser.BOOLEAN, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FnListener ) ((FnListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__13);
			setState(88);
			match(T__0);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				comparation();
				}
				break;
			case 2:
				{
				setState(90);
				match(BOOLEAN);
				}
				break;
			}
			setState(93);
			match(T__1);
			setState(94);
			match(T__14);
			setState(95);
			expression();
			setState(96);
			match(T__15);
			setState(97);
			match(T__16);
			setState(98);
			match(T__14);
			setState(99);
			expression();
			setState(100);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3\5\3&"+
		"\n\3\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\rP\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20^\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\4\4\2\f\f\25\25\3\2\r\17\2b\2 \3\2\2\2\4%\3\2\2\2\6+\3\2\2\2\b\60\3"+
		"\2\2\2\n\62\3\2\2\2\f\66\3\2\2\2\16:\3\2\2\2\20>\3\2\2\2\22B\3\2\2\2\24"+
		"E\3\2\2\2\26K\3\2\2\2\30O\3\2\2\2\32Q\3\2\2\2\34U\3\2\2\2\36Y\3\2\2\2"+
		" !\5\4\3\2!\3\3\2\2\2\"&\5\6\4\2#&\5\n\6\2$&\5\36\20\2%\"\3\2\2\2%#\3"+
		"\2\2\2%$\3\2\2\2&\5\3\2\2\2\',\5\f\7\2(,\5\16\b\2),\5\20\t\2*,\5\22\n"+
		"\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-\61\5\24\13\2."+
		"\61\5\26\f\2/\61\5\n\6\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\t\3\2"+
		"\2\2\62\63\7\3\2\2\63\64\5\4\3\2\64\65\7\4\2\2\65\13\3\2\2\2\66\67\5\b"+
		"\5\2\678\7\5\2\289\5\b\5\29\r\3\2\2\2:;\5\b\5\2;<\7\6\2\2<=\5\b\5\2=\17"+
		"\3\2\2\2>?\5\b\5\2?@\7\7\2\2@A\5\26\f\2A\21\3\2\2\2BC\5\26\f\2CD\7\b\2"+
		"\2D\23\3\2\2\2EF\7\t\2\2FG\5\b\5\2GH\7\n\2\2HI\5\b\5\2IJ\7\13\2\2J\25"+
		"\3\2\2\2KL\t\2\2\2L\27\3\2\2\2MP\5\32\16\2NP\5\34\17\2OM\3\2\2\2ON\3\2"+
		"\2\2P\31\3\2\2\2QR\5\b\5\2RS\t\3\2\2ST\5\b\5\2T\33\3\2\2\2UV\7\24\2\2"+
		"VW\7\17\2\2WX\7\24\2\2X\35\3\2\2\2YZ\7\20\2\2Z]\7\3\2\2[^\5\30\r\2\\^"+
		"\7\24\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\4\2\2`a\7\21\2\2ab\5\4\3"+
		"\2bc\7\22\2\2cd\7\23\2\2de\7\21\2\2ef\5\4\3\2fg\7\22\2\2g\37\3\2\2\2\7"+
		"%+\60O]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}