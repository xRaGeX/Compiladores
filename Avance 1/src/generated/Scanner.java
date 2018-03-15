// Generated from C:/Users/Daniel/Dropbox/Yo/TEC/Semestre 1 2018/Compi/Repositorio/Compiladores-/Avance 1\Scanner.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, COMA=2, ASIGNACION=3, MAYIGUAL=4, MENIGUAL=5, IGUAL=6, MAYOR=7, 
		MENOR=8, DOSPTOS=9, SUM=10, RES=11, MUL=12, DIV=13, PARIZQ=14, PARDER=15, 
		PARCUADIZQ=16, PARCUADDER=17, CORCHETEIZQ=18, CORCHETEDER=19, COMILLADOBLE=20, 
		INICIOCOMANI=21, FINCOMANI=22, SALTOLINEA=23, IF=24, WHILE=25, LET=26, 
		ELSE=27, RETURN=28, INT=29, STRING=30, TRUE=31, FALSE=32, FN=33, PUTS=34, 
		LEN=35, FIRST=36, LAST=37, REST=38, PUSH=39, NUM=40, STR=41, ID=42, COMENTARIO_LINEA=43, 
		COMENTARIO_MULTILINEA=44, WS=45, LINE_COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PyCOMA", "COMA", "ASIGNACION", "MAYIGUAL", "MENIGUAL", "IGUAL", "MAYOR", 
		"MENOR", "DOSPTOS", "SUM", "RES", "MUL", "DIV", "PARIZQ", "PARDER", "PARCUADIZQ", 
		"PARCUADDER", "CORCHETEIZQ", "CORCHETEDER", "COMILLADOBLE", "INICIOCOMANI", 
		"FINCOMANI", "SALTOLINEA", "IF", "WHILE", "LET", "ELSE", "RETURN", "INT", 
		"STRING", "TRUE", "FALSE", "FN", "PUTS", "LEN", "FIRST", "LAST", "REST", 
		"PUSH", "NUM", "STR", "ID", "LETTER", "DIGIT", "COMENTARIO_LINEA", "COMENTARIO_MULTILINEA", 
		"WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'>='", "'<='", "'=='", "'>'", "'<'", "':'", 
		"'+'", null, null, "'/'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", 
		"'/*'", "'*/'", "'\n'", "'if'", "'while'", "'let'", "'else'", "'return'", 
		"'Integer'", "'String'", "'true'", "'false'", "'fn'", "'puts'", "'len'", 
		"'first'", "'last'", "'rest'", "'push'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PyCOMA", "COMA", "ASIGNACION", "MAYIGUAL", "MENIGUAL", "IGUAL", 
		"MAYOR", "MENOR", "DOSPTOS", "SUM", "RES", "MUL", "DIV", "PARIZQ", "PARDER", 
		"PARCUADIZQ", "PARCUADDER", "CORCHETEIZQ", "CORCHETEDER", "COMILLADOBLE", 
		"INICIOCOMANI", "FINCOMANI", "SALTOLINEA", "IF", "WHILE", "LET", "ELSE", 
		"RETURN", "INT", "STRING", "TRUE", "FALSE", "FN", "PUTS", "LEN", "FIRST", 
		"LAST", "REST", "PUSH", "NUM", "STR", "ID", "COMENTARIO_LINEA", "COMENTARIO_MULTILINEA", 
		"WS", "LINE_COMMENT"
	};
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\7)"+
		"\u00ee\n)\f)\16)\u00f1\13)\5)\u00f3\n)\3*\3*\3*\3*\7*\u00f9\n*\f*\16*"+
		"\u00fc\13*\3*\3*\3+\3+\3+\7+\u0103\n+\f+\16+\u0106\13+\3,\3,\3-\3-\3."+
		"\3.\3.\3.\7.\u0110\n.\f.\16.\u0113\13.\3.\5.\u0116\n.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\7/\u0121\n/\f/\16/\u0124\13/\3/\3/\3/\3/\3/\3\60\6\60\u012c"+
		"\n\60\r\60\16\60\u012d\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0136\n\61\f"+
		"\61\16\61\u0139\13\61\3\61\5\61\u013c\n\61\3\61\3\61\3\61\3\61\4\u0111"+
		"\u0122\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[-]._/a\60\3\2\6\3\2$$\4"+
		"\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u014b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\ti\3"+
		"\2\2\2\13l\3\2\2\2\ro\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x"+
		"\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082"+
		"\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2"+
		")\u008c\3\2\2\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61\u0096"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u009f\3\2\2\2\67\u00a3\3\2\2\29\u00a8\3\2"+
		"\2\2;\u00af\3\2\2\2=\u00b7\3\2\2\2?\u00be\3\2\2\2A\u00c3\3\2\2\2C\u00c9"+
		"\3\2\2\2E\u00cc\3\2\2\2G\u00d1\3\2\2\2I\u00d5\3\2\2\2K\u00db\3\2\2\2M"+
		"\u00e0\3\2\2\2O\u00e5\3\2\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00ff\3\2"+
		"\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010b\3\2\2\2]\u011b\3\2\2\2_\u012b"+
		"\3\2\2\2a\u0131\3\2\2\2cd\7=\2\2d\4\3\2\2\2ef\7.\2\2f\6\3\2\2\2gh\7?\2"+
		"\2h\b\3\2\2\2ij\7@\2\2jk\7?\2\2k\n\3\2\2\2lm\7>\2\2mn\7?\2\2n\f\3\2\2"+
		"\2op\7?\2\2pq\7?\2\2q\16\3\2\2\2rs\7@\2\2s\20\3\2\2\2tu\7>\2\2u\22\3\2"+
		"\2\2vw\7<\2\2w\24\3\2\2\2xy\7-\2\2y\26\3\2\2\2z{\7,\2\2{\30\3\2\2\2|}"+
		"\7,\2\2}\32\3\2\2\2~\177\7\61\2\2\177\34\3\2\2\2\u0080\u0081\7*\2\2\u0081"+
		"\36\3\2\2\2\u0082\u0083\7+\2\2\u0083 \3\2\2\2\u0084\u0085\7]\2\2\u0085"+
		"\"\3\2\2\2\u0086\u0087\7_\2\2\u0087$\3\2\2\2\u0088\u0089\7}\2\2\u0089"+
		"&\3\2\2\2\u008a\u008b\7\177\2\2\u008b(\3\2\2\2\u008c\u008d\7$\2\2\u008d"+
		"*\3\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7,\2\2\u0090,\3\2\2\2\u0091"+
		"\u0092\7,\2\2\u0092\u0093\7\61\2\2\u0093.\3\2\2\2\u0094\u0095\7\f\2\2"+
		"\u0095\60\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\62\3\2\2"+
		"\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7n\2\2\u009d\u009e\7g\2\2\u009e\64\3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a78\3\2\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae:\3\2\2\2\u00af\u00b0\7K\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7i\2\2"+
		"\u00b4\u00b5\7g\2\2\u00b5\u00b6\7t\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7U\2"+
		"\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7i\2\2\u00bd>\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2@\3\2\2\2\u00c3\u00c4"+
		"\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7p\2\2\u00cb"+
		"D\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7v\2\2\u00daJ\3\2\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2"+
		"\u00dfL\3\2\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7u\2"+
		"\2\u00e3\u00e4\7v\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7"+
		"w\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7j\2\2\u00e9P\3\2\2\2\u00ea\u00f3"+
		"\7\62\2\2\u00eb\u00ef\4\63;\2\u00ec\u00ee\4\62;\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f3"+
		"R\3\2\2\2\u00f4\u00fa\7$\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f9\7$\2\2\u00f7"+
		"\u00f9\n\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7$\2\2\u00feT\3\2\2\2\u00ff\u0104\5W,\2\u0100"+
		"\u0103\5W,\2\u0101\u0103\5Y-\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105V\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\t\3\2\2\u0108X\3\2\2\2\u0109\u010a"+
		"\4\62;\2\u010aZ\3\2\2\2\u010b\u010c\7\61\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u0110\13\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0116\7\17\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\f\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\b.\2\2\u011a\\\3\2\2\2\u011b\u011c\7\61\2\2\u011c\u011d\7,\2\2"+
		"\u011d\u0122\3\2\2\2\u011e\u0121\5]/\2\u011f\u0121\13\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7,"+
		"\2\2\u0126\u0127\7\61\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b/\2\2\u0129"+
		"^\3\2\2\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\b\60\2\2\u0130`\3\2\2\2\u0131\u0132\7\61\2\2\u0132\u0133\7\61\2\2\u0133"+
		"\u0137\3\2\2\2\u0134\u0136\n\5\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\7\17\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\f\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\b\61\3\2\u0140b\3\2\2\2\20\2\u00ef\u00f2\u00f8\u00fa\u0102\u0104"+
		"\u0111\u0115\u0120\u0122\u012d\u0137\u013b\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}