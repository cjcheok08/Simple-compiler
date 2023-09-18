// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, INT=2, FLOAT=3, IF=4, ELSE=5, WHILE=6, INT_DT=7, FLOAT_DT=8, 
		DEF=9, ID=10, ADD=11, SUB=12, MUL=13, DIV=14, MOD=15, ASSIGN=16, ADD_EQ=17, 
		SUB_EQ=18, MUL_EQ=19, DIV_EQ=20, MOD_EQ=21, LPAREN=22, RPAREN=23, LBRAC=24, 
		RBRAC=25, EQUALS=26, NOT_EQ=27, GREATER=28, LESS=29, AND=30, OR=31, GREAT_EQ=32, 
		LESS_EQ=33, COMMA=34, WS=35, COMMENT=36;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_type = 2, RULE_arg = 3, RULE_block = 4, 
		RULE_arithAssign = 5, RULE_boolExpr = 6, RULE_expr = 7, RULE_atom = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "type", "arg", "block", "arithAssign", "boolExpr", "expr", 
			"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'if'", "'else'", "'while'", "'int'", "'float'", 
			"'def'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'('", "')'", "'{'", "'}'", "'=='", "'!='", "'>'", 
			"'<'", "'&&'", "'||'", "'>='", "'<='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "INT", "FLOAT", "IF", "ELSE", "WHILE", "INT_DT", "FLOAT_DT", 
			"DEF", "ID", "ADD", "SUB", "MUL", "DIV", "MOD", "ASSIGN", "ADD_EQ", "SUB_EQ", 
			"MUL_EQ", "DIV_EQ", "MOD_EQ", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", 
			"NOT_EQ", "GREATER", "LESS", "AND", "OR", "GREAT_EQ", "LESS_EQ", "COMMA", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 4200412L) != 0 );
			setState(23);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithAssignStatContext extends StatContext {
		public ArithAssignContext arithAssign() {
			return getRuleContext(ArithAssignContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public ArithAssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArithAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArithAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArithAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineFunctionContext extends StatContext {
		public TerminalNode DEF() { return getToken(ExprParser.DEF, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public DefineFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDefineFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDefineFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDefineFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatContext extends StatContext {
		public BoolExprContext condition;
		public BlockContext thenBlock;
		public BlockContext elseBlock;
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public IfElseStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfElseStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenStatContext extends StatContext {
		public BoolExprContext condition;
		public BlockContext thenBlock;
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public IfThenStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfThenStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfThenStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfThenStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrintStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends StatContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public CallFunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStatContext extends StatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public DeclareStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclareStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclareStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclareStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatContext extends StatContext {
		public BoolExprContext condition;
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IfElseStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(IF);
				setState(26);
				match(LPAREN);
				setState(27);
				((IfElseStatContext)_localctx).condition = boolExpr(0);
				setState(28);
				match(RPAREN);
				setState(29);
				((IfElseStatContext)_localctx).thenBlock = block();
				setState(30);
				match(ELSE);
				setState(31);
				((IfElseStatContext)_localctx).elseBlock = block();
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(NEWLINE);
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				_localctx = new IfThenStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IF);
				setState(38);
				match(LPAREN);
				setState(39);
				((IfThenStatContext)_localctx).condition = boolExpr(0);
				setState(40);
				match(RPAREN);
				setState(41);
				((IfThenStatContext)_localctx).thenBlock = block();
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					match(NEWLINE);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 3:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(WHILE);
				setState(48);
				match(LPAREN);
				setState(49);
				((WhileStatContext)_localctx).condition = boolExpr(0);
				setState(50);
				match(RPAREN);
				setState(51);
				block();
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					match(NEWLINE);
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 4:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				expr(0);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					match(NEWLINE);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 5:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_DT || _la==FLOAT_DT) {
					{
					setState(63);
					type();
					}
				}

				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(0);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					match(NEWLINE);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 6:
				_localctx = new DeclareStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				type();
				setState(75);
				match(ID);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					match(NEWLINE);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 7:
				_localctx = new ArithAssignStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				arithAssign();
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					match(NEWLINE);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 8:
				_localctx = new DefineFunctionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(DEF);
				setState(88);
				match(ID);
				setState(89);
				match(LPAREN);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_DT || _la==FLOAT_DT) {
					{
					setState(90);
					arg();
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(91);
						match(COMMA);
						setState(92);
						arg();
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(100);
				match(RPAREN);
				setState(101);
				block();
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					match(NEWLINE);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 9:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				match(ID);
				setState(108);
				match(LPAREN);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 5132L) != 0) {
					{
					setState(109);
					atom();
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(110);
						match(COMMA);
						setState(111);
						atom();
						}
						}
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(119);
				match(RPAREN);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(NEWLINE);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_DT() { return getToken(ExprParser.INT_DT, 0); }
		public TerminalNode FLOAT_DT() { return getToken(ExprParser.FLOAT_DT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==INT_DT || _la==FLOAT_DT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			type();
			setState(130);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(ExprParser.LBRAC, 0); }
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public TerminalNode RBRAC() { return getToken(ExprParser.RBRAC, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LBRAC);
			setState(133);
			match(NEWLINE);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				stat();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 4200412L) != 0 );
			setState(139);
			match(RBRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithAssignContext extends ParserRuleContext {
		public Token left;
		public Token op;
		public ExprContext right;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD_EQ() { return getToken(ExprParser.ADD_EQ, 0); }
		public TerminalNode SUB_EQ() { return getToken(ExprParser.SUB_EQ, 0); }
		public TerminalNode MUL_EQ() { return getToken(ExprParser.MUL_EQ, 0); }
		public TerminalNode DIV_EQ() { return getToken(ExprParser.DIV_EQ, 0); }
		public TerminalNode MOD_EQ() { return getToken(ExprParser.MOD_EQ, 0); }
		public ArithAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArithAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithAssignContext arithAssign() throws RecognitionException {
		ArithAssignContext _localctx = new ArithAssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arithAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((ArithAssignContext)_localctx).left = match(ID);
			setState(142);
			((ArithAssignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4063232L) != 0) ) {
				((ArithAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			((ArithAssignContext)_localctx).right = expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BoolExprContext {
		public BoolExprContext left;
		public Token op;
		public BoolExprContext right;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public OrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualsContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQ() { return getToken(ExprParser.LESS_EQ, 0); }
		public LessEqualsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLessEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLessEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLessEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BoolExprContext {
		public BoolExprContext left;
		public Token op;
		public BoolExprContext right;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public AndContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public EqualsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualsContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREAT_EQ() { return getToken(ExprParser.GREAT_EQ, 0); }
		public GreaterEqualsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGreaterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGreaterEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGreaterEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualsContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_EQ() { return getToken(ExprParser.NOT_EQ, 0); }
		public NotEqualsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParenContext extends BoolExprContext {
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public BoolParenContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(ExprParser.LESS, 0); }
		public LessContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterContext extends BoolExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(ExprParser.GREATER, 0); }
		public GreaterContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				((EqualsContext)_localctx).left = expr(0);
				setState(147);
				((EqualsContext)_localctx).op = match(EQUALS);
				setState(148);
				((EqualsContext)_localctx).right = expr(0);
				}
				break;
			case 2:
				{
				_localctx = new NotEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				((NotEqualsContext)_localctx).left = expr(0);
				setState(151);
				((NotEqualsContext)_localctx).op = match(NOT_EQ);
				setState(152);
				((NotEqualsContext)_localctx).right = expr(0);
				}
				break;
			case 3:
				{
				_localctx = new GreaterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				((GreaterContext)_localctx).left = expr(0);
				setState(155);
				((GreaterContext)_localctx).op = match(GREATER);
				setState(156);
				((GreaterContext)_localctx).right = expr(0);
				}
				break;
			case 4:
				{
				_localctx = new LessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				((LessContext)_localctx).left = expr(0);
				setState(159);
				((LessContext)_localctx).op = match(LESS);
				setState(160);
				((LessContext)_localctx).right = expr(0);
				}
				break;
			case 5:
				{
				_localctx = new GreaterEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				((GreaterEqualsContext)_localctx).left = expr(0);
				setState(163);
				((GreaterEqualsContext)_localctx).op = match(GREAT_EQ);
				setState(164);
				((GreaterEqualsContext)_localctx).right = expr(0);
				}
				break;
			case 6:
				{
				_localctx = new LessEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((LessEqualsContext)_localctx).left = expr(0);
				setState(167);
				((LessEqualsContext)_localctx).op = match(LESS_EQ);
				setState(168);
				((LessEqualsContext)_localctx).right = expr(0);
				}
				break;
			case 7:
				{
				_localctx = new BoolParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(LPAREN);
				setState(171);
				boolExpr(0);
				setState(172);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						((AndContext)_localctx).op = match(AND);
						setState(178);
						((AndContext)_localctx).right = boolExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(179);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(180);
						((OrContext)_localctx).op = match(OR);
						setState(181);
						((OrContext)_localctx).right = boolExpr(3);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ExprParser.MOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
			case SUB:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				atom();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(LPAREN);
				setState(190);
				expr(0);
				setState(191);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						((MulDivModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((MulDivModContext)_localctx).right = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						((AddSubContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegativeNumContext extends AtomContext {
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public NegativeNumContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNegativeNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNegativeNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNegativeNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends AtomContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IdContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public FloatContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				_localctx = new NegativeNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(SUB);
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001"+
		"\u000b\u0001\f\u0001#\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001,\b\u0001\u000b\u0001\f\u0001-\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u00016\b\u0001\u000b\u0001\f\u00017\u0001\u0001\u0001\u0001\u0004\u0001"+
		"<\b\u0001\u000b\u0001\f\u0001=\u0001\u0001\u0003\u0001A\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001G\b\u0001\u000b"+
		"\u0001\f\u0001H\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001N\b\u0001"+
		"\u000b\u0001\f\u0001O\u0001\u0001\u0001\u0001\u0004\u0001T\b\u0001\u000b"+
		"\u0001\f\u0001U\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001^\b\u0001\n\u0001\f\u0001a\t\u0001\u0003"+
		"\u0001c\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001h\b\u0001"+
		"\u000b\u0001\f\u0001i\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001q\b\u0001\n\u0001\f\u0001t\t\u0001\u0003\u0001"+
		"v\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001z\b\u0001\u000b\u0001\f\u0001"+
		"{\u0003\u0001~\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0088\b\u0004"+
		"\u000b\u0004\f\u0004\u0089\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00af\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b7\b\u0006\n\u0006"+
		"\f\u0006\u00ba\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c2\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ca\b\u0007"+
		"\n\u0007\f\u0007\u00cd\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u00d4\b\b\u0001\b\u0000\u0002\f\u000e\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0005\u0001\u0000\u0007\b\u0001\u0000\u0011\u0015"+
		"\u0001\u0000\r\u000f\u0001\u0000\u000b\f\u0001\u0000\u0002\u0003\u00f2"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0002}\u0001\u0000\u0000\u0000\u0004"+
		"\u007f\u0001\u0000\u0000\u0000\u0006\u0081\u0001\u0000\u0000\u0000\b\u0084"+
		"\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u00ae\u0001"+
		"\u0000\u0000\u0000\u000e\u00c1\u0001\u0000\u0000\u0000\u0010\u00d3\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\u0004\u0000\u0000\u001a\u001b\u0005"+
		"\u0016\u0000\u0000\u001b\u001c\u0003\f\u0006\u0000\u001c\u001d\u0005\u0017"+
		"\u0000\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f\u0005\u0005\u0000"+
		"\u0000\u001f!\u0003\b\u0004\u0000 \"\u0005\u0001\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$~\u0001\u0000\u0000\u0000%&\u0005\u0004\u0000\u0000"+
		"&\'\u0005\u0016\u0000\u0000\'(\u0003\f\u0006\u0000()\u0005\u0017\u0000"+
		"\u0000)+\u0003\b\u0004\u0000*,\u0005\u0001\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.~\u0001\u0000\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005"+
		"\u0016\u0000\u000012\u0003\f\u0006\u000023\u0005\u0017\u0000\u000035\u0003"+
		"\b\u0004\u000046\u0005\u0001\u0000\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8~\u0001\u0000\u0000\u00009;\u0003\u000e\u0007\u0000:<\u0005\u0001\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>~\u0001\u0000\u0000\u0000?A\u0003"+
		"\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0005\n\u0000\u0000CD\u0005\u0010\u0000\u0000"+
		"DF\u0003\u000e\u0007\u0000EG\u0005\u0001\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000I~\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002\u0000KM\u0005"+
		"\n\u0000\u0000LN\u0005\u0001\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P~\u0001\u0000\u0000\u0000QS\u0003\n\u0005\u0000RT\u0005\u0001\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000V~\u0001\u0000\u0000\u0000WX\u0005\t\u0000"+
		"\u0000XY\u0005\n\u0000\u0000Yb\u0005\u0016\u0000\u0000Z_\u0003\u0006\u0003"+
		"\u0000[\\\u0005\"\u0000\u0000\\^\u0003\u0006\u0003\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bZ\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0005\u0017\u0000\u0000eg\u0003\b\u0004\u0000fh\u0005\u0001\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j~\u0001\u0000\u0000\u0000kl\u0005"+
		"\n\u0000\u0000lu\u0005\u0016\u0000\u0000mr\u0003\u0010\b\u0000no\u0005"+
		"\"\u0000\u0000oq\u0003\u0010\b\u0000pn\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000um\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0005\u0017"+
		"\u0000\u0000xz\u0005\u0001\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}\u0019\u0001\u0000\u0000\u0000}%\u0001\u0000"+
		"\u0000\u0000}/\u0001\u0000\u0000\u0000}9\u0001\u0000\u0000\u0000}@\u0001"+
		"\u0000\u0000\u0000}J\u0001\u0000\u0000\u0000}Q\u0001\u0000\u0000\u0000"+
		"}W\u0001\u0000\u0000\u0000}k\u0001\u0000\u0000\u0000~\u0003\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080\u0005\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082\u0083\u0005\n\u0000"+
		"\u0000\u0083\u0007\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0018\u0000"+
		"\u0000\u0085\u0087\u0005\u0001\u0000\u0000\u0086\u0088\u0003\u0002\u0001"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0019\u0000"+
		"\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000"+
		"\u008e\u008f\u0007\u0001\u0000\u0000\u008f\u0090\u0003\u000e\u0007\u0000"+
		"\u0090\u000b\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0006\uffff\uffff"+
		"\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093\u0094\u0005\u001a\u0000"+
		"\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u00af\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0098\u0005\u001b\u0000"+
		"\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u00af\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0005\u001c\u0000"+
		"\u0000\u009c\u009d\u0003\u000e\u0007\u0000\u009d\u00af\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0003\u000e\u0007\u0000\u009f\u00a0\u0005\u001d\u0000"+
		"\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1\u00af\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\u000e\u0007\u0000\u00a3\u00a4\u0005 \u0000\u0000"+
		"\u00a4\u00a5\u0003\u000e\u0007\u0000\u00a5\u00af\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u000e\u0007\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8"+
		"\u00a9\u0003\u000e\u0007\u0000\u00a9\u00af\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ac\u0003\f\u0006\u0000\u00ac\u00ad"+
		"\u0005\u0017\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u0091"+
		"\u0001\u0000\u0000\u0000\u00ae\u0096\u0001\u0000\u0000\u0000\u00ae\u009a"+
		"\u0001\u0000\u0000\u0000\u00ae\u009e\u0001\u0000\u0000\u0000\u00ae\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000\u00ae\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u00b8\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\n\u0003\u0000\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2\u00b7\u0003"+
		"\f\u0006\u0004\u00b3\u00b4\n\u0002\u0000\u0000\u00b4\u00b5\u0005\u001f"+
		"\u0000\u0000\u00b5\u00b7\u0003\f\u0006\u0003\u00b6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0006\u0007\uffff\uffff\u0000\u00bc\u00c2\u0003\u0010\b\u0000"+
		"\u00bd\u00be\u0005\u0016\u0000\u0000\u00be\u00bf\u0003\u000e\u0007\u0000"+
		"\u00bf\u00c0\u0005\u0017\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c2\u00cb\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0004\u0000\u0000\u00c4"+
		"\u00c5\u0007\u0002\u0000\u0000\u00c5\u00ca\u0003\u000e\u0007\u0005\u00c6"+
		"\u00c7\n\u0003\u0000\u0000\u00c7\u00c8\u0007\u0003\u0000\u0000\u00c8\u00ca"+
		"\u0003\u000e\u0007\u0004\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c6"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u000f"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\f\u0000\u0000\u00cf\u00d4\u0007\u0004\u0000\u0000\u00d0\u00d4\u0005"+
		"\u0002\u0000\u0000\u00d1\u00d4\u0005\u0003\u0000\u0000\u00d2\u00d4\u0005"+
		"\n\u0000\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u0011\u0001\u0000\u0000\u0000\u0018\u0015#-7=@HOU_"+
		"biru{}\u0089\u00ae\u00b6\u00b8\u00c1\u00c9\u00cb\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}