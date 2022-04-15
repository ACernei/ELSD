// Generated from tumcadGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tumcadGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Letter=30, Digit=31, 
		Boolean_value=32, Arithmetic_operator=33, Comparison_operator=34, Logical_operator=35, 
		Assignment_operator=36, WS=37, TEXT=38;
	public static final int
		RULE_program = 0, RULE_program_body = 1, RULE_set_of_statements = 2, RULE_basic_statements = 3, 
		RULE_if_statement = 4, RULE_for_each = 5, RULE_read_excelfile = 6, RULE_read_textfile = 7, 
		RULE_calculate_area = 8, RULE_sketch = 9, RULE_variable_declaration = 10, 
		RULE_variable_initialization = 11, RULE_function_call = 12, RULE_name = 13, 
		RULE_list_name = 14, RULE_value = 15, RULE_integer_value = 16, RULE_double_value = 17, 
		RULE_type = 18, RULE_function_declaration = 19, RULE_function_body = 20, 
		RULE_function_parameters = 21, RULE_list_declaration = 22, RULE_expression = 23, 
		RULE_number_expression = 24, RULE_string_expression = 25, RULE_boolean_expression = 26, 
		RULE_operator = 27, RULE_string_value = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_body", "set_of_statements", "basic_statements", "if_statement", 
			"for_each", "read_excelfile", "read_textfile", "calculate_area", "sketch", 
			"variable_declaration", "variable_initialization", "function_call", "name", 
			"list_name", "value", "integer_value", "double_value", "type", "function_declaration", 
			"function_body", "function_parameters", "list_declaration", "expression", 
			"number_expression", "string_expression", "boolean_expression", "operator", 
			"string_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'START TUMCAD'", "'FINISH'", "'Return'", "'if'", "'('", "')'", 
			"'{'", "'}'", "'else'", "'foreach'", "'in'", "'readXLS'", "'readTXT'", 
			"'area'", "'sketch'", "'='", "'_'", "'[]'", "'.'", "'Int'", "'Double'", 
			"'String'", "'Bool'", "'Void'", "'Func'", "'void'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Letter", "Digit", "Boolean_value", 
			"Arithmetic_operator", "Comparison_operator", "Logical_operator", "Assignment_operator", 
			"WS", "TEXT"
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
	public String getGrammarFileName() { return "tumcadGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tumcadGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program_bodyContext program_body() {
			return getRuleContext(Program_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			program_body();
			setState(60);
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

	public static class Program_bodyContext extends ParserRuleContext {
		public List<Set_of_statementsContext> set_of_statements() {
			return getRuleContexts(Set_of_statementsContext.class);
		}
		public Set_of_statementsContext set_of_statements(int i) {
			return getRuleContext(Set_of_statementsContext.class,i);
		}
		public Program_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterProgram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitProgram_body(this);
		}
	}

	public final Program_bodyContext program_body() throws RecognitionException {
		Program_bodyContext _localctx = new Program_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Letter) | (1L << Digit) | (1L << Arithmetic_operator) | (1L << Comparison_operator) | (1L << Logical_operator) | (1L << Assignment_operator) | (1L << WS) | (1L << TEXT))) != 0)) {
				{
				{
				setState(62);
				set_of_statements();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Set_of_statementsContext extends ParserRuleContext {
		public Basic_statementsContext basic_statements() {
			return getRuleContext(Basic_statementsContext.class,0);
		}
		public Variable_initializationContext variable_initialization() {
			return getRuleContext(Variable_initializationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Set_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_of_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterSet_of_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitSet_of_statements(this);
		}
	}

	public final Set_of_statementsContext set_of_statements() throws RecognitionException {
		Set_of_statementsContext _localctx = new Set_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_set_of_statements);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				basic_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				variable_initialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				function_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				operator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(T__2);
				setState(76);
				expression();
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

	public static class Basic_statementsContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public Read_excelfileContext read_excelfile() {
			return getRuleContext(Read_excelfileContext.class,0);
		}
		public Read_textfileContext read_textfile() {
			return getRuleContext(Read_textfileContext.class,0);
		}
		public Calculate_areaContext calculate_area() {
			return getRuleContext(Calculate_areaContext.class,0);
		}
		public SketchContext sketch() {
			return getRuleContext(SketchContext.class,0);
		}
		public Basic_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterBasic_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitBasic_statements(this);
		}
	}

	public final Basic_statementsContext basic_statements() throws RecognitionException {
		Basic_statementsContext _localctx = new Basic_statementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basic_statements);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				if_statement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				for_each();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				read_excelfile();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				read_textfile();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				calculate_area();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				sketch();
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

	public static class If_statementContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<Set_of_statementsContext> set_of_statements() {
			return getRuleContexts(Set_of_statementsContext.class);
		}
		public Set_of_statementsContext set_of_statements(int i) {
			return getRuleContext(Set_of_statementsContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__3);
			setState(88);
			match(T__4);
			setState(89);
			boolean_expression();
			setState(90);
			match(T__5);
			setState(91);
			match(T__6);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				set_of_statements();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Letter) | (1L << Digit) | (1L << Arithmetic_operator) | (1L << Comparison_operator) | (1L << Logical_operator) | (1L << Assignment_operator) | (1L << WS) | (1L << TEXT))) != 0) );
			setState(97);
			match(T__7);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(98);
				match(T__8);
				setState(99);
				match(T__6);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					set_of_statements();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Letter) | (1L << Digit) | (1L << Arithmetic_operator) | (1L << Comparison_operator) | (1L << Logical_operator) | (1L << Assignment_operator) | (1L << WS) | (1L << TEXT))) != 0) );
				setState(105);
				match(T__7);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class For_eachContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List_nameContext list_name() {
			return getRuleContext(List_nameContext.class,0);
		}
		public Set_of_statementsContext set_of_statements() {
			return getRuleContext(Set_of_statementsContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitFor_each(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__9);
			setState(113);
			variable_declaration();
			setState(114);
			match(T__10);
			setState(115);
			list_name();
			setState(116);
			match(T__6);
			setState(117);
			set_of_statements();
			setState(118);
			match(T__7);
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

	public static class Read_excelfileContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Read_excelfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_excelfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterRead_excelfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitRead_excelfile(this);
		}
	}

	public final Read_excelfileContext read_excelfile() throws RecognitionException {
		Read_excelfileContext _localctx = new Read_excelfileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read_excelfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			match(T__4);
			setState(122);
			string_value();
			setState(123);
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

	public static class Read_textfileContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Read_textfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_textfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterRead_textfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitRead_textfile(this);
		}
	}

	public final Read_textfileContext read_textfile() throws RecognitionException {
		Read_textfileContext _localctx = new Read_textfileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read_textfile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__12);
			setState(126);
			match(T__4);
			setState(127);
			string_value();
			setState(128);
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

	public static class Calculate_areaContext extends ParserRuleContext {
		public Read_excelfileContext read_excelfile() {
			return getRuleContext(Read_excelfileContext.class,0);
		}
		public Read_textfileContext read_textfile() {
			return getRuleContext(Read_textfileContext.class,0);
		}
		public List_nameContext list_name() {
			return getRuleContext(List_nameContext.class,0);
		}
		public Calculate_areaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculate_area; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterCalculate_area(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitCalculate_area(this);
		}
	}

	public final Calculate_areaContext calculate_area() throws RecognitionException {
		Calculate_areaContext _localctx = new Calculate_areaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_calculate_area);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__13);
			setState(131);
			match(T__4);
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(132);
				read_excelfile();
				}
				break;
			case T__12:
				{
				setState(133);
				read_textfile();
				}
				break;
			case T__16:
			case Letter:
				{
				setState(134);
				list_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
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

	public static class SketchContext extends ParserRuleContext {
		public Read_excelfileContext read_excelfile() {
			return getRuleContext(Read_excelfileContext.class,0);
		}
		public Read_textfileContext read_textfile() {
			return getRuleContext(Read_textfileContext.class,0);
		}
		public List_nameContext list_name() {
			return getRuleContext(List_nameContext.class,0);
		}
		public SketchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sketch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterSketch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitSketch(this);
		}
	}

	public final SketchContext sketch() throws RecognitionException {
		SketchContext _localctx = new SketchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sketch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__14);
			setState(140);
			match(T__4);
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(141);
				read_excelfile();
				}
				break;
			case T__12:
				{
				setState(142);
				read_textfile();
				}
				break;
			case T__16:
			case Letter:
				{
				setState(143);
				list_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(146);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type();
			setState(149);
			name();
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

	public static class Variable_initializationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterVariable_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitVariable_initialization(this);
		}
	}

	public final Variable_initializationContext variable_initialization() throws RecognitionException {
		Variable_initializationContext _localctx = new Variable_initializationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			name();
			setState(152);
			match(T__15);
			setState(153);
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

	public static class Function_callContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			name();
			setState(156);
			match(T__4);
			setState(157);
			function_parameters();
			setState(158);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(tumcadGrammarParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(tumcadGrammarParser.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(tumcadGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(tumcadGrammarParser.Digit, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(160);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==Letter) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class List_nameContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(tumcadGrammarParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(tumcadGrammarParser.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(tumcadGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(tumcadGrammarParser.Digit, i);
		}
		public List_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterList_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitList_name(this);
		}
	}

	public final List_nameContext list_name() throws RecognitionException {
		List_nameContext _localctx = new List_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==Letter) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__17);
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

	public static class ValueContext extends ParserRuleContext {
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Double_valueContext double_value() {
			return getRuleContext(Double_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public TerminalNode Boolean_value() { return getToken(tumcadGrammarParser.Boolean_value, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				integer_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				double_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				string_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(Boolean_value);
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

	public static class Integer_valueContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(tumcadGrammarParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(tumcadGrammarParser.Digit, i);
		}
		public Integer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterInteger_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitInteger_value(this);
		}
	}

	public final Integer_valueContext integer_value() throws RecognitionException {
		Integer_valueContext _localctx = new Integer_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integer_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(190);
					match(Digit);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Double_valueContext extends ParserRuleContext {
		public List<Integer_valueContext> integer_value() {
			return getRuleContexts(Integer_valueContext.class);
		}
		public Integer_valueContext integer_value(int i) {
			return getRuleContext(Integer_valueContext.class,i);
		}
		public Double_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterDouble_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitDouble_value(this);
		}
	}

	public final Double_valueContext double_value() throws RecognitionException {
		Double_valueContext _localctx = new Double_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_double_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			integer_value();
			setState(196);
			match(T__18);
			setState(197);
			integer_value();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class Function_declarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Function_parametersContext> function_parameters() {
			return getRuleContexts(Function_parametersContext.class);
		}
		public Function_parametersContext function_parameters(int i) {
			return getRuleContext(Function_parametersContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__24);
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				{
				setState(202);
				type();
				}
				break;
			case T__25:
				{
				setState(203);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			name();
			setState(207);
			match(T__4);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				{
				setState(208);
				function_parameters();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__5);
			setState(215);
			match(T__6);
			setState(216);
			function_body();
			setState(217);
			match(T__7);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Set_of_statementsContext> set_of_statements() {
			return getRuleContexts(Set_of_statementsContext.class);
		}
		public Set_of_statementsContext set_of_statements(int i) {
			return getRuleContext(Set_of_statementsContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					set_of_statements();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(225);
			match(T__2);
			setState(226);
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

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<List_declarationContext> list_declaration() {
			return getRuleContexts(List_declarationContext.class);
		}
		public List_declarationContext list_declaration(int i) {
			return getRuleContext(List_declarationContext.class,i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(228);
				variable_declaration();
				}
				break;
			case 2:
				{
				setState(229);
				list_declaration();
				}
				break;
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(232);
					match(T__26);
					setState(233);
					variable_declaration();
					}
					break;
				case 2:
					{
					setState(234);
					match(T__26);
					setState(235);
					list_declaration();
					}
					break;
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class List_declarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public List_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterList_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitList_declaration(this);
		}
	}

	public final List_declarationContext list_declaration() throws RecognitionException {
		List_declarationContext _localctx = new List_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			variable_declaration();
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(242);
				match(T__27);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) {
					{
					setState(243);
					number_expression();
					}
				}

				setState(246);
				match(T__28);
				}
				break;
			case 2:
				{
				setState(247);
				match(T__27);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) {
					{
					setState(248);
					number_expression();
					}
				}

				setState(251);
				match(T__28);
				setState(252);
				match(T__27);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << Letter) | (1L << Digit))) != 0)) {
					{
					setState(253);
					number_expression();
					}
				}

				setState(256);
				match(T__28);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				number_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				boolean_expression();
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

	public static class Number_expressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Double_valueContext double_value() {
			return getRuleContext(Double_valueContext.class,0);
		}
		public List<TerminalNode> Arithmetic_operator() { return getTokens(tumcadGrammarParser.Arithmetic_operator); }
		public TerminalNode Arithmetic_operator(int i) {
			return getToken(tumcadGrammarParser.Arithmetic_operator, i);
		}
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public Number_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterNumber_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitNumber_expression(this);
		}
	}

	public final Number_expressionContext number_expression() throws RecognitionException {
		Number_expressionContext _localctx = new Number_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(264);
				name();
				}
				break;
			case 2:
				{
				setState(265);
				integer_value();
				}
				break;
			case 3:
				{
				setState(266);
				double_value();
				}
				break;
			}
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(Arithmetic_operator);
					setState(270);
					number_expression();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class String_expressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public List<TerminalNode> Arithmetic_operator() { return getTokens(tumcadGrammarParser.Arithmetic_operator); }
		public TerminalNode Arithmetic_operator(int i) {
			return getToken(tumcadGrammarParser.Arithmetic_operator, i);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case Letter:
				{
				setState(276);
				name();
				}
				break;
			case WS:
			case TEXT:
				{
				setState(277);
				string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(Arithmetic_operator);
					setState(281);
					string_expression();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public TerminalNode Comparison_operator() { return getToken(tumcadGrammarParser.Comparison_operator, 0); }
		public TerminalNode Logical_operator() { return getToken(tumcadGrammarParser.Logical_operator, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolean_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(287);
				number_expression();
				}
				break;
			case 2:
				{
				setState(288);
				string_expression();
				}
				break;
			}
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==Comparison_operator || _la==Logical_operator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(292);
				number_expression();
				}
				break;
			case 2:
				{
				setState(293);
				string_expression();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode Arithmetic_operator() { return getToken(tumcadGrammarParser.Arithmetic_operator, 0); }
		public TerminalNode Comparison_operator() { return getToken(tumcadGrammarParser.Comparison_operator, 0); }
		public TerminalNode Logical_operator() { return getToken(tumcadGrammarParser.Logical_operator, 0); }
		public TerminalNode Assignment_operator() { return getToken(tumcadGrammarParser.Assignment_operator, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Arithmetic_operator) | (1L << Comparison_operator) | (1L << Logical_operator) | (1L << Assignment_operator))) != 0)) ) {
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

	public static class String_valueContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(tumcadGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(tumcadGrammarParser.TEXT, i);
		}
		public List<TerminalNode> WS() { return getTokens(tumcadGrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(tumcadGrammarParser.WS, i);
		}
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).enterString_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tumcadGrammarListener ) ((tumcadGrammarListener)listener).exitString_value(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(298);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==TEXT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(301); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6`\n\6\r\6"+
		"\16\6a\3\6\3\6\3\6\3\6\6\6h\n\6\r\6\16\6i\3\6\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0093\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\6\17\u00a4\n\17\r\17\16\17\u00a5\3\17\7\17\u00a9\n\17"+
		"\f\17\16\17\u00ac\13\17\3\20\6\20\u00af\n\20\r\20\16\20\u00b0\3\20\7\20"+
		"\u00b4\n\20\f\20\16\20\u00b7\13\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00bf\n\21\3\22\6\22\u00c2\n\22\r\22\16\22\u00c3\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u00cf\n\25\3\25\3\25\3\25\7\25\u00d4\n"+
		"\25\f\25\16\25\u00d7\13\25\3\25\3\25\3\25\3\25\3\25\3\26\7\26\u00df\n"+
		"\26\f\26\16\26\u00e2\13\26\3\26\3\26\3\26\3\27\3\27\5\27\u00e9\n\27\3"+
		"\27\3\27\3\27\3\27\7\27\u00ef\n\27\f\27\16\27\u00f2\13\27\3\30\3\30\3"+
		"\30\5\30\u00f7\n\30\3\30\3\30\3\30\5\30\u00fc\n\30\3\30\3\30\3\30\5\30"+
		"\u0101\n\30\3\30\5\30\u0104\n\30\3\31\3\31\3\31\5\31\u0109\n\31\3\32\3"+
		"\32\3\32\5\32\u010e\n\32\3\32\3\32\7\32\u0112\n\32\f\32\16\32\u0115\13"+
		"\32\3\33\3\33\5\33\u0119\n\33\3\33\3\33\7\33\u011d\n\33\f\33\16\33\u0120"+
		"\13\33\3\34\3\34\5\34\u0124\n\34\3\34\3\34\3\34\5\34\u0129\n\34\3\35\3"+
		"\35\3\36\6\36\u012e\n\36\r\36\16\36\u012f\3\36\2\2\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\4\2\23\23  \4\2\23\23"+
		" !\3\2\26\32\3\2$%\3\2#&\3\2\'(\2\u0144\2<\3\2\2\2\4C\3\2\2\2\6O\3\2\2"+
		"\2\bW\3\2\2\2\nY\3\2\2\2\fr\3\2\2\2\16z\3\2\2\2\20\177\3\2\2\2\22\u0084"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u0096\3\2\2\2\30\u0099\3\2\2\2\32\u009d\3"+
		"\2\2\2\34\u00a3\3\2\2\2\36\u00ae\3\2\2\2 \u00be\3\2\2\2\"\u00c1\3\2\2"+
		"\2$\u00c5\3\2\2\2&\u00c9\3\2\2\2(\u00cb\3\2\2\2*\u00e0\3\2\2\2,\u00e8"+
		"\3\2\2\2.\u00f3\3\2\2\2\60\u0108\3\2\2\2\62\u010d\3\2\2\2\64\u0118\3\2"+
		"\2\2\66\u0123\3\2\2\28\u012a\3\2\2\2:\u012d\3\2\2\2<=\7\3\2\2=>\5\4\3"+
		"\2>?\7\4\2\2?\3\3\2\2\2@B\5\6\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\5\3\2\2\2EC\3\2\2\2FP\5\b\5\2GP\5\30\r\2HP\5\26\f\2IP\5(\25\2JP"+
		"\5\32\16\2KP\5\60\31\2LP\58\35\2MN\7\5\2\2NP\5\60\31\2OF\3\2\2\2OG\3\2"+
		"\2\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2P\7\3"+
		"\2\2\2QX\5\n\6\2RX\5\f\7\2SX\5\16\b\2TX\5\20\t\2UX\5\22\n\2VX\5\24\13"+
		"\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t\3\2"+
		"\2\2YZ\7\6\2\2Z[\7\7\2\2[\\\5\66\34\2\\]\7\b\2\2]_\7\t\2\2^`\5\6\4\2_"+
		"^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2co\7\n\2\2de\7\13\2\2"+
		"eg\7\t\2\2fh\5\6\4\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2"+
		"kl\7\n\2\2ln\3\2\2\2md\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2"+
		"\2qo\3\2\2\2rs\7\f\2\2st\5\26\f\2tu\7\r\2\2uv\5\36\20\2vw\7\t\2\2wx\5"+
		"\6\4\2xy\7\n\2\2y\r\3\2\2\2z{\7\16\2\2{|\7\7\2\2|}\5:\36\2}~\7\b\2\2~"+
		"\17\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\7\2\2\u0081\u0082\5:\36\2"+
		"\u0082\u0083\7\b\2\2\u0083\21\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0089"+
		"\7\7\2\2\u0086\u008a\5\16\b\2\u0087\u008a\5\20\t\2\u0088\u008a\5\36\20"+
		"\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\7\b\2\2\u008c\23\3\2\2\2\u008d\u008e\7\21\2\2\u008e"+
		"\u0092\7\7\2\2\u008f\u0093\5\16\b\2\u0090\u0093\5\20\t\2\u0091\u0093\5"+
		"\36\20\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\b\2\2\u0095\25\3\2\2\2\u0096\u0097\5&\24"+
		"\2\u0097\u0098\5\34\17\2\u0098\27\3\2\2\2\u0099\u009a\5\34\17\2\u009a"+
		"\u009b\7\22\2\2\u009b\u009c\5\60\31\2\u009c\31\3\2\2\2\u009d\u009e\5\34"+
		"\17\2\u009e\u009f\7\7\2\2\u009f\u00a0\5,\27\2\u00a0\u00a1\7\b\2\2\u00a1"+
		"\33\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9"+
		"\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\t\2\2"+
		"\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\24\2\2\u00b9\37\3\2\2\2\u00ba\u00bf"+
		"\5\"\22\2\u00bb\u00bf\5$\23\2\u00bc\u00bf\5:\36\2\u00bd\u00bf\7\"\2\2"+
		"\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c2\7!\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5"+
		"\u00c6\5\"\22\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\5\"\22\2\u00c8%\3\2\2"+
		"\2\u00c9\u00ca\t\4\2\2\u00ca\'\3\2\2\2\u00cb\u00ce\7\33\2\2\u00cc\u00cf"+
		"\5&\24\2\u00cd\u00cf\7\34\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d5\7\7\2\2\u00d2\u00d4"+
		"\5,\27\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\b"+
		"\2\2\u00d9\u00da\7\t\2\2\u00da\u00db\5*\26\2\u00db\u00dc\7\n\2\2\u00dc"+
		")\3\2\2\2\u00dd\u00df\5\6\4\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5\5\60\31\2\u00e5+\3\2\2\2\u00e6"+
		"\u00e9\5\26\f\2\u00e7\u00e9\5.\30\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00f0\3\2\2\2\u00ea\u00eb\7\35\2\2\u00eb\u00ef\5\26\f\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ef\5.\30\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"-\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u0103\5\26\f\2\u00f4\u00f6\7\36\2"+
		"\2\u00f5\u00f7\5\62\32\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u0104\7\37\2\2\u00f9\u00fb\7\36\2\2\u00fa\u00fc\5"+
		"\62\32\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\7\37\2\2\u00fe\u0100\7\36\2\2\u00ff\u0101\5\62\32\2\u0100\u00ff"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\7\37\2\2"+
		"\u0103\u00f4\3\2\2\2\u0103\u00f9\3\2\2\2\u0104/\3\2\2\2\u0105\u0109\5"+
		"\62\32\2\u0106\u0109\5\64\33\2\u0107\u0109\5\66\34\2\u0108\u0105\3\2\2"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\61\3\2\2\2\u010a\u010e"+
		"\5\34\17\2\u010b\u010e\5\"\22\2\u010c\u010e\5$\23\2\u010d\u010a\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0113\3\2\2\2\u010f\u0110"+
		"\7#\2\2\u0110\u0112\5\62\32\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\63\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0119\5\34\17\2\u0117\u0119\5:\36\2\u0118\u0116\3\2\2\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011e\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011d"+
		"\5\64\33\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\65\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0124"+
		"\5\62\32\2\u0122\u0124\5\64\33\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0128\t\5\2\2\u0126\u0129\5\62\32\2\u0127"+
		"\u0129\5\64\33\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\67\3\2"+
		"\2\2\u012a\u012b\t\6\2\2\u012b9\3\2\2\2\u012c\u012e\t\7\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		";\3\2\2\2\"COWaio\u0089\u0092\u00a5\u00aa\u00b0\u00b5\u00be\u00c3\u00ce"+
		"\u00d5\u00e0\u00e8\u00ee\u00f0\u00f6\u00fb\u0100\u0103\u0108\u010d\u0113"+
		"\u0118\u011e\u0123\u0128\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}