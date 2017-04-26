package main;

// Generated from brgccf_lfp2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class brgccf_lfp2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, WS=36, INTEGER_LITERAL=37, Identifier=38, 
		Comment_line=39, Comment_ext=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "WS", "INTEGER_LITERAL", "Identifier", 
		"Comment_line", "Comment_ext"
	};
	public static final int
		RULE_eval = 0, RULE_goal = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_expression = 8;
	public static final String[] ruleNames = {
		"eval", "goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "brgccf_lfp2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public brgccf_lfp2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public GoalContext goal() {
			return getRuleContext(GoalContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); goal();
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

	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(brgccf_lfp2Parser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(21); classDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(brgccf_lfp2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(brgccf_lfp2Parser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(T__29);
			setState(30); match(Identifier);
			setState(31); match(T__25);
			setState(32); match(T__6);
			setState(33); match(T__4);
			setState(34); match(T__26);
			setState(35); match(T__34);
			setState(36); match(T__18);
			setState(37); match(T__8);
			setState(38); match(T__10);
			setState(39); match(T__7);
			setState(40); match(Identifier);
			setState(41); match(T__2);
			setState(42); match(T__25);
			setState(43); statement();
			setState(44); match(T__21);
			setState(45); match(T__21);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(brgccf_lfp2Parser.Identifier); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(brgccf_lfp2Parser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__29);
			setState(48); match(Identifier);
			setState(51);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(49); match(T__22);
				setState(50); match(Identifier);
				}
			}

			setState(53); match(T__25);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				{
				setState(54); varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(60); methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__21);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); type();
			setState(69); match(Identifier);
			setState(70); match(T__27);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(brgccf_lfp2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(brgccf_lfp2Parser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__6);
			setState(73); type();
			setState(74); match(Identifier);
			setState(75); match(T__18);
			setState(87);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				setState(76); type();
				setState(77); match(Identifier);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(78); match(T__15);
					setState(79); type();
					setState(80); match(Identifier);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89); match(T__2);
			setState(90); match(T__25);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91); varDeclaration();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << Identifier))) != 0)) {
				{
				{
				setState(97); statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(T__30);
			setState(104); expression(0);
			setState(105); match(T__27);
			setState(106); match(T__21);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(T__19);
				setState(109); match(T__10);
				setState(110); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(T__25);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << Identifier))) != 0)) {
					{
					{
					setState(117); statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123); match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(T__20);
				setState(125); match(T__18);
				setState(126); expression(0);
				setState(127); match(T__2);
				setState(128); statement();
				setState(129); match(T__3);
				setState(130); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); match(T__28);
				setState(133); match(T__18);
				setState(134); expression(0);
				setState(135); match(T__2);
				setState(136); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(T__11);
				setState(139); match(T__18);
				setState(140); expression(0);
				setState(141); match(T__2);
				setState(142); match(T__27);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144); match(Identifier);
				setState(145); match(T__23);
				setState(146); expression(0);
				setState(147); match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); match(Identifier);
				setState(150); match(T__10);
				setState(151); expression(0);
				setState(152); match(T__7);
				setState(153); match(T__23);
				setState(154); expression(0);
				setState(155); match(T__27);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(brgccf_lfp2Parser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(160); match(T__5);
				setState(161); expression(2);
				}
				break;
			case 2:
				{
				setState(162); match(T__10);
				setState(163); expression(0);
				setState(164); match(T__7);
				}
				break;
			case 3:
				{
				setState(166); match(T__13);
				setState(167); match(T__33);
				}
				break;
			case 4:
				{
				setState(168); match(T__13);
				setState(169); match(Identifier);
				setState(170); match(T__18);
				setState(179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__10) | (1L << T__5) | (1L << INTEGER_LITERAL) | (1L << Identifier))) != 0)) {
					{
					setState(171); expression(0);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(172); match(T__15);
						setState(173); expression(0);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(181); match(T__2);
				}
				break;
			case 5:
				{
				setState(182); match(INTEGER_LITERAL);
				}
				break;
			case 6:
				{
				setState(183); match(T__31);
				}
				break;
			case 7:
				{
				setState(184); match(T__14);
				}
				break;
			case 8:
				{
				setState(185); match(Identifier);
				}
				break;
			case 9:
				{
				setState(186); match(T__16);
				}
				break;
			case 10:
				{
				setState(187); match(T__32);
				setState(188); match(T__19);
				setState(189); match(T__10);
				setState(190); expression(0);
				setState(191); match(T__7);
				}
				break;
			case 11:
				{
				setState(193); match(T__32);
				setState(194); match(Identifier);
				setState(195); match(T__18);
				setState(196); match(T__2);
				}
				break;
			case 12:
				{
				setState(197); match(T__18);
				setState(198); expression(0);
				setState(199); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(203);
					if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
					setState(204);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(205); expression(14);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7U\n\7\f"+
		"\7\16\7X\13\7\5\7Z\n\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\7\7e\n"+
		"\7\f\7\16\7h\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b"+
		"\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b1\n\n\f\n\16\n\u00b4\13\n\5\n"+
		"\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\n\3\n\3\n\7\n\u00d1\n\n\f\n\16\n"+
		"\u00d4\13\n\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\3\6\2\r\r\24\24\34\34"+
		"$%\u00eb\2\24\3\2\2\2\4\26\3\2\2\2\6\37\3\2\2\2\b\61\3\2\2\2\nF\3\2\2"+
		"\2\fJ\3\2\2\2\16t\3\2\2\2\20\u009f\3\2\2\2\22\u00cb\3\2\2\2\24\25\5\4"+
		"\3\2\25\3\3\2\2\2\26\32\5\6\4\2\27\31\5\b\5\2\30\27\3\2\2\2\31\34\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\2"+
		"\2\3\36\5\3\2\2\2\37 \7\b\2\2 !\7(\2\2!\"\7\f\2\2\"#\7\37\2\2#$\7!\2\2"+
		"$%\7\13\2\2%&\7\3\2\2&\'\7\23\2\2\'(\7\35\2\2()\7\33\2\2)*\7\36\2\2*+"+
		"\7(\2\2+,\7#\2\2,-\7\f\2\2-.\5\20\t\2./\7\20\2\2/\60\7\20\2\2\60\7\3\2"+
		"\2\2\61\62\7\b\2\2\62\65\7(\2\2\63\64\7\17\2\2\64\66\7(\2\2\65\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67;\7\f\2\28:\5\n\6\298\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\20\2\2E\t\3\2\2\2FG\5"+
		"\16\b\2GH\7(\2\2HI\7\n\2\2I\13\3\2\2\2JK\7\37\2\2KL\5\16\b\2LM\7(\2\2"+
		"MY\7\23\2\2NO\5\16\b\2OV\7(\2\2PQ\7\26\2\2QR\5\16\b\2RS\7(\2\2SU\3\2\2"+
		"\2TP\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YN\3\2\2"+
		"\2YZ\3\2\2\2Z[\3\2\2\2[\\\7#\2\2\\`\7\f\2\2]_\5\n\6\2^]\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5\20\t\2dc\3\2\2\2eh\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\7\2\2jk\5\22\n\2kl"+
		"\7\n\2\2lm\7\20\2\2m\r\3\2\2\2no\7\22\2\2op\7\33\2\2pu\7\36\2\2qu\7\31"+
		"\2\2ru\7\22\2\2su\7(\2\2tn\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\17\3"+
		"\2\2\2vz\7\f\2\2wy\5\20\t\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}"+
		"\3\2\2\2|z\3\2\2\2}\u00a0\7\20\2\2~\177\7\21\2\2\177\u0080\7\23\2\2\u0080"+
		"\u0081\5\22\n\2\u0081\u0082\7#\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7"+
		"\"\2\2\u0084\u0085\5\20\t\2\u0085\u00a0\3\2\2\2\u0086\u0087\7\t\2\2\u0087"+
		"\u0088\7\23\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7#\2\2\u008a\u008b\5"+
		"\20\t\2\u008b\u00a0\3\2\2\2\u008c\u008d\7\32\2\2\u008d\u008e\7\23\2\2"+
		"\u008e\u008f\5\22\n\2\u008f\u0090\7#\2\2\u0090\u0091\7\n\2\2\u0091\u00a0"+
		"\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0094\7\16\2\2\u0094\u0095\5\22\n\2"+
		"\u0095\u0096\7\n\2\2\u0096\u00a0\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099"+
		"\7\33\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\36\2\2\u009b\u009c\7\16\2"+
		"\2\u009c\u009d\5\22\n\2\u009d\u009e\7\n\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"v\3\2\2\2\u009f~\3\2\2\2\u009f\u0086\3\2\2\2\u009f\u008c\3\2\2\2\u009f"+
		"\u0092\3\2\2\2\u009f\u0097\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\b\n\1"+
		"\2\u00a2\u00a3\7 \2\2\u00a3\u00cc\5\22\n\4\u00a4\u00a5\7\33\2\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a7\7\36\2\2\u00a7\u00cc\3\2\2\2\u00a8\u00a9\7"+
		"\30\2\2\u00a9\u00cc\7\4\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u00b5\7\23\2\2\u00ad\u00b2\5\22\n\2\u00ae\u00af\7\26\2\2\u00af\u00b1"+
		"\5\22\n\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00cc\7#\2\2\u00b8"+
		"\u00cc\7\'\2\2\u00b9\u00cc\7\6\2\2\u00ba\u00cc\7\27\2\2\u00bb\u00cc\7"+
		"(\2\2\u00bc\u00cc\7\25\2\2\u00bd\u00be\7\5\2\2\u00be\u00bf\7\22\2\2\u00bf"+
		"\u00c0\7\33\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7\36\2\2\u00c2\u00cc"+
		"\3\2\2\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\7(\2\2\u00c5\u00c6\7\23\2\2\u00c6"+
		"\u00cc\7#\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\5\22\n\2\u00c9\u00ca\7"+
		"#\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00a1\3\2\2\2\u00cb\u00a4\3\2\2\2\u00cb"+
		"\u00a8\3\2\2\2\u00cb\u00aa\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cb\u00b9\3\2"+
		"\2\2\u00cb\u00ba\3\2\2\2\u00cb\u00bb\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb"+
		"\u00bd\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00d2\3\2"+
		"\2\2\u00cd\u00ce\f\17\2\2\u00ce\u00cf\t\2\2\2\u00cf\u00d1\5\22\n\20\u00d0"+
		"\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\23\3\2\2\2\u00d4\u00d2\3\2\2\2\21\32\65;AVY`ftz\u009f\u00b2"+
		"\u00b5\u00cb\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}