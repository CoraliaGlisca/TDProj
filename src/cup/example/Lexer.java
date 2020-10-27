/* The following code was generated by JFlex 1.3.5 on 10/28/20 12:29 AM */

package cup.example;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 10/28/20 12:29 AM from the specification file
 * <tt>file:/C:/Users/Cora/eclipse-workspace/M+-/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\13\1\1\1\0\1\13\1\12\16\0\4\0\1\13\3\0"+
    "\1\0\1\16\1\21\1\0\1\31\1\32\1\15\1\17\1\40\1\20"+
    "\1\0\1\14\12\0\1\30\1\37\1\26\1\25\1\27\2\0\32\0"+
    "\1\35\1\0\1\36\1\0\1\0\1\53\1\7\1\45\1\52\1\44"+
    "\1\5\1\6\1\46\1\42\1\41\2\0\1\10\1\0\1\23\1\24"+
    "\1\47\1\0\1\3\1\11\1\2\1\4\1\50\1\43\2\0\1\51"+
    "\1\33\1\22\1\34\1\0\41\0\2\0\4\0\4\0\1\0\2\0"+
    "\1\0\7\0\1\0\4\0\1\0\5\0\27\0\1\0\37\0\1\0"+
    "\u01ca\0\4\0\14\0\16\0\5\0\7\0\1\0\1\0\1\0\21\0"+
    "\160\0\5\0\1\0\2\0\2\0\4\0\10\0\1\0\1\0\3\0"+
    "\1\0\1\0\1\0\24\0\1\0\123\0\1\0\213\0\1\0\5\0"+
    "\2\0\236\0\11\0\46\0\2\0\1\0\7\0\47\0\7\0\1\0"+
    "\1\0\55\0\1\0\1\0\1\0\2\0\1\0\2\0\1\0\1\0"+
    "\10\0\33\0\5\0\3\0\15\0\5\0\6\0\1\0\4\0\13\0"+
    "\5\0\53\0\37\0\4\0\2\0\1\0\143\0\1\0\1\0\10\0"+
    "\1\0\6\0\2\0\2\0\1\0\4\0\2\0\12\0\3\0\2\0"+
    "\1\0\17\0\1\0\1\0\1\0\36\0\33\0\2\0\131\0\13\0"+
    "\1\0\16\0\12\0\41\0\11\0\2\0\4\0\1\0\5\0\26\0"+
    "\4\0\1\0\11\0\1\0\3\0\1\0\5\0\22\0\31\0\3\0"+
    "\104\0\1\0\1\0\13\0\67\0\33\0\1\0\4\0\66\0\3\0"+
    "\1\0\22\0\1\0\7\0\12\0\2\0\2\0\12\0\1\0\7\0"+
    "\1\0\7\0\1\0\3\0\1\0\10\0\2\0\2\0\2\0\26\0"+
    "\1\0\7\0\1\0\1\0\3\0\4\0\2\0\1\0\1\0\7\0"+
    "\2\0\2\0\2\0\3\0\1\0\10\0\1\0\4\0\2\0\1\0"+
    "\3\0\2\0\2\0\12\0\4\0\7\0\1\0\5\0\3\0\1\0"+
    "\6\0\4\0\2\0\2\0\26\0\1\0\7\0\1\0\2\0\1\0"+
    "\2\0\1\0\2\0\2\0\1\0\1\0\5\0\4\0\2\0\2\0"+
    "\3\0\3\0\1\0\7\0\4\0\1\0\1\0\7\0\14\0\3\0"+
    "\1\0\13\0\3\0\1\0\11\0\1\0\3\0\1\0\26\0\1\0"+
    "\7\0\1\0\2\0\1\0\5\0\2\0\1\0\1\0\10\0\1\0"+
    "\3\0\1\0\3\0\2\0\1\0\17\0\2\0\2\0\2\0\12\0"+
    "\1\0\1\0\17\0\3\0\1\0\10\0\2\0\2\0\2\0\26\0"+
    "\1\0\7\0\1\0\2\0\1\0\5\0\2\0\1\0\1\0\7\0"+
    "\2\0\2\0\2\0\3\0\10\0\2\0\4\0\2\0\1\0\3\0"+
    "\2\0\2\0\12\0\1\0\1\0\20\0\1\0\1\0\1\0\6\0"+
    "\3\0\3\0\1\0\4\0\3\0\2\0\1\0\1\0\1\0\2\0"+
    "\3\0\2\0\3\0\3\0\3\0\14\0\4\0\5\0\3\0\3\0"+
    "\1\0\4\0\2\0\1\0\6\0\1\0\16\0\12\0\11\0\1\0"+
    "\7\0\3\0\1\0\10\0\1\0\3\0\1\0\27\0\1\0\12\0"+
    "\1\0\5\0\3\0\1\0\7\0\1\0\3\0\1\0\4\0\7\0"+
    "\2\0\1\0\2\0\6\0\2\0\2\0\2\0\12\0\22\0\2\0"+
    "\1\0\10\0\1\0\3\0\1\0\27\0\1\0\12\0\1\0\5\0"+
    "\2\0\1\0\1\0\7\0\1\0\3\0\1\0\4\0\7\0\2\0"+
    "\7\0\1\0\1\0\2\0\2\0\2\0\12\0\1\0\2\0\17\0"+
    "\2\0\1\0\10\0\1\0\3\0\1\0\51\0\2\0\1\0\7\0"+
    "\1\0\3\0\1\0\4\0\1\0\10\0\1\0\10\0\2\0\2\0"+
    "\2\0\12\0\12\0\6\0\2\0\2\0\1\0\22\0\3\0\30\0"+
    "\1\0\11\0\1\0\1\0\2\0\7\0\3\0\1\0\4\0\6\0"+
    "\1\0\1\0\1\0\10\0\22\0\2\0\15\0\60\0\1\0\2\0"+
    "\7\0\4\0\10\0\10\0\1\0\12\0\47\0\2\0\1\0\1\0"+
    "\2\0\2\0\1\0\1\0\2\0\1\0\6\0\4\0\1\0\7\0"+
    "\1\0\3\0\1\0\1\0\1\0\1\0\2\0\2\0\1\0\4\0"+
    "\1\0\2\0\6\0\1\0\2\0\1\0\2\0\5\0\1\0\1\0"+
    "\1\0\6\0\2\0\12\0\2\0\4\0\40\0\1\0\27\0\2\0"+
    "\6\0\12\0\13\0\1\0\1\0\1\0\1\0\1\0\4\0\2\0"+
    "\10\0\1\0\44\0\4\0\24\0\1\0\2\0\5\0\13\0\1\0"+
    "\44\0\11\0\1\0\71\0\53\0\24\0\1\0\12\0\6\0\6\0"+
    "\4\0\4\0\3\0\1\0\3\0\2\0\7\0\3\0\4\0\15\0"+
    "\14\0\1\0\17\0\2\0\46\0\1\0\1\0\5\0\1\0\2\0"+
    "\53\0\1\0\u014d\0\1\0\4\0\2\0\7\0\1\0\1\0\1\0"+
    "\4\0\2\0\51\0\1\0\4\0\2\0\41\0\1\0\4\0\2\0"+
    "\7\0\1\0\1\0\1\0\4\0\2\0\17\0\1\0\71\0\1\0"+
    "\4\0\2\0\103\0\2\0\3\0\40\0\20\0\20\0\125\0\14\0"+
    "\u026c\0\2\0\21\0\1\0\32\0\5\0\113\0\3\0\3\0\17\0"+
    "\15\0\1\0\4\0\3\0\13\0\22\0\3\0\13\0\22\0\2\0"+
    "\14\0\15\0\1\0\3\0\1\0\2\0\14\0\64\0\40\0\3\0"+
    "\1\0\3\0\2\0\1\0\2\0\12\0\41\0\3\0\2\0\12\0"+
    "\6\0\130\0\10\0\51\0\1\0\1\0\5\0\106\0\12\0\35\0"+
    "\3\0\14\0\4\0\14\0\12\0\12\0\36\0\2\0\5\0\13\0"+
    "\54\0\4\0\21\0\7\0\2\0\6\0\12\0\46\0\27\0\5\0"+
    "\4\0\65\0\12\0\1\0\35\0\2\0\13\0\6\0\12\0\15\0"+
    "\1\0\130\0\5\0\57\0\21\0\7\0\4\0\12\0\21\0\11\0"+
    "\14\0\3\0\36\0\15\0\2\0\12\0\54\0\16\0\14\0\44\0"+
    "\24\0\10\0\12\0\3\0\3\0\12\0\44\0\122\0\3\0\1\0"+
    "\25\0\4\0\1\0\4\0\3\0\2\0\11\0\300\0\47\0\25\0"+
    "\4\0\u0116\0\2\0\6\0\2\0\46\0\2\0\6\0\2\0\10\0"+
    "\1\0\1\0\1\0\1\0\1\0\1\0\1\0\37\0\2\0\65\0"+
    "\1\0\7\0\1\0\1\0\3\0\3\0\1\0\7\0\3\0\4\0"+
    "\2\0\6\0\4\0\15\0\5\0\3\0\1\0\7\0\16\0\5\0"+
    "\32\0\5\0\20\0\2\0\23\0\1\0\13\0\5\0\5\0\6\0"+
    "\1\0\1\0\15\0\1\0\20\0\15\0\3\0\33\0\25\0\15\0"+
    "\4\0\1\0\3\0\14\0\21\0\1\0\4\0\1\0\2\0\12\0"+
    "\1\0\1\0\3\0\5\0\6\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\4\0\1\0\13\0\2\0\4\0\5\0\5\0\4\0\1\0"+
    "\21\0\51\0\u0a77\0\57\0\1\0\57\0\1\0\205\0\6\0\4\0"+
    "\3\0\2\0\14\0\46\0\1\0\1\0\5\0\1\0\2\0\70\0"+
    "\7\0\1\0\17\0\1\0\27\0\11\0\7\0\1\0\7\0\1\0"+
    "\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0\7\0\1\0"+
    "\7\0\1\0\40\0\57\0\1\0\u01d5\0\3\0\31\0\11\0\6\0"+
    "\1\0\5\0\2\0\5\0\4\0\126\0\2\0\2\0\2\0\3\0"+
    "\1\0\132\0\1\0\4\0\5\0\51\0\3\0\136\0\21\0\33\0"+
    "\65\0\20\0\u0200\0\u19b6\0\112\0\u51cd\0\63\0\u048d\0\103\0\56\0"+
    "\2\0\u010d\0\3\0\20\0\12\0\2\0\24\0\57\0\1\0\4\0"+
    "\12\0\1\0\31\0\7\0\1\0\120\0\2\0\45\0\11\0\2\0"+
    "\147\0\2\0\4\0\1\0\4\0\14\0\13\0\115\0\12\0\1\0"+
    "\3\0\1\0\4\0\1\0\27\0\5\0\20\0\1\0\7\0\64\0"+
    "\14\0\2\0\62\0\21\0\13\0\12\0\6\0\22\0\6\0\3\0"+
    "\1\0\4\0\12\0\34\0\10\0\2\0\27\0\15\0\14\0\35\0"+
    "\3\0\4\0\57\0\16\0\16\0\1\0\12\0\46\0\51\0\16\0"+
    "\11\0\3\0\1\0\10\0\2\0\2\0\12\0\6\0\27\0\3\0"+
    "\1\0\1\0\4\0\60\0\1\0\1\0\3\0\2\0\2\0\5\0"+
    "\2\0\1\0\1\0\1\0\30\0\3\0\2\0\13\0\5\0\2\0"+
    "\3\0\2\0\12\0\6\0\2\0\6\0\2\0\6\0\11\0\7\0"+
    "\1\0\7\0\221\0\43\0\10\0\1\0\2\0\2\0\12\0\6\0"+
    "\u2ba4\0\14\0\27\0\4\0\61\0\u2104\0\u016e\0\2\0\152\0\46\0"+
    "\7\0\14\0\5\0\5\0\1\0\1\0\12\0\1\0\15\0\1\0"+
    "\5\0\1\0\1\0\1\0\2\0\1\0\2\0\1\0\154\0\41\0"+
    "\u016b\0\22\0\100\0\2\0\66\0\50\0\15\0\3\0\20\0\20\0"+
    "\7\0\14\0\2\0\30\0\3\0\31\0\1\0\6\0\5\0\1\0"+
    "\207\0\2\0\1\0\4\0\1\0\13\0\12\0\7\0\32\0\4\0"+
    "\1\0\1\0\32\0\13\0\131\0\3\0\6\0\2\0\6\0\2\0"+
    "\6\0\2\0\3\0\3\0\2\0\3\0\2\0\22\0\3\0\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    44,    44,    88,   132,   176,   220,   264,   308,   352, 
       44,   396,    44,    44,   440,   484,   528,   572,    44,   616, 
      660,    44,    44,    44,    44,    44,    44,    44,    44,   704, 
      748,   792,   836,   880,   924,   968,    44,  1012,  1056,  1100, 
     1144,  1188,  1232,  1276,  1320,    44,    44,  1364,    44,    44, 
       44,    44,  1408,  1452,    44,  1496,  1540,  1584,  1628,  1672, 
     1716,  1760,  1804,  1848,    44,    44,  1892,  1936,  1980,  2024, 
       44,    44,  2068,  2112,  2156,  2200,    44,  2244,    44,  2288, 
       44,    44,    44,  2332,  2376,    44,  2420,  2464,  2508,    44, 
     2552,    44,  2596,    44,    44,    44,    44,    44,    44
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\0\1\3\1\4\1\5\1\0\1\6\1\7\2\0"+
    "\1\10\1\11\1\3\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\0\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\0\1\37\1\40\1\41\1\0\1\42\1\43"+
    "\1\0\1\44\1\45\116\0\1\46\16\0\1\47\56\0"+
    "\1\50\12\0\1\51\34\0\1\52\3\0\1\53\104\0"+
    "\1\54\13\0\1\3\67\0\1\55\36\0\1\14\1\3"+
    "\10\14\1\11\41\14\21\0\1\56\54\0\1\57\55\0"+
    "\1\60\55\0\1\61\52\0\1\62\53\0\1\63\34\0"+
    "\1\64\14\0\1\65\72\0\1\66\35\0\1\67\34\0"+
    "\1\70\16\0\1\71\32\0\1\72\57\0\1\73\51\0"+
    "\1\74\53\0\1\75\50\0\1\76\4\0\1\77\55\0"+
    "\1\100\106\0\1\101\32\0\1\102\54\0\1\103\100\0"+
    "\1\104\2\0\15\105\1\106\36\105\2\0\1\107\53\0"+
    "\1\110\112\0\1\111\60\0\1\112\31\0\1\113\70\0"+
    "\1\114\15\0\1\115\111\0\1\116\35\0\1\117\34\0"+
    "\1\120\57\0\1\121\33\0\1\122\14\0\1\123\55\0"+
    "\1\124\14\0\1\125\34\0\1\126\46\0\15\105\1\127"+
    "\36\105\14\0\1\3\1\106\46\0\1\130\104\0\1\131"+
    "\22\0\1\132\66\0\1\133\40\0\1\134\46\0\1\135"+
    "\52\0\1\136\54\0\1\137\50\0\14\105\1\3\1\127"+
    "\36\105\5\0\1\140\71\0\1\141\32\0\1\142\74\0"+
    "\1\143\30\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  8,  9,  0,  0,  0,  0,  0,  1,  1,  9,  1,  9,  9,  0,  0, 
     0,  1,  9,  1,  1,  9,  9,  9,  9,  9,  9,  9,  9,  0,  0,  0, 
     0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9,  0, 
     9,  9,  9,  9,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9,  9,  0,  0,  0,  0,  9,  9,  0,  0,  0,  0,  9,  0,  9,  0, 
     9,  9,  9,  0,  0,  9,  0,  0,  0,  9,  0,  9,  0,  9,  9,  9, 
     9,  9,  9
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
   StringBuffer string = new StringBuffer();

      private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
      }
      private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
      }
      


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[2640];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2240) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 98: 
          {  return symbol(sym.RETURN);  }
        case 100: break;
        case 50: 
          {  return symbol(sym.ASSIGN);  }
        case 101: break;
        case 27: 
          {  return symbol(sym.SEMICOLON);  }
        case 102: break;
        case 19: 
          {  return symbol(sym.GT);  }
        case 103: break;
        case 2: 
        case 8: 
          {  /* ignore */  }
        case 104: break;
        case 9: 
          {  return symbol(sym.DIV);  }
        case 105: break;
        case 10: 
          {  return symbol(sym.MUL);  }
        case 106: break;
        case 11: 
          {  /* ignore */  }
        case 107: break;
        case 12: 
          {  return symbol(sym.ADD);  }
        case 108: break;
        case 13: 
          {  return symbol(sym.SUB);  }
        case 109: break;
        case 18: 
          {  return symbol(sym.LT);  }
        case 110: break;
        case 45: 
          {  return symbol(sym.AND);  }
        case 111: break;
        case 46: 
          {  return symbol(sym.OR);  }
        case 112: break;
        case 48: 
          {  return symbol(sym.LE);  }
        case 113: break;
        case 49: 
          {  return symbol(sym.GE);  }
        case 114: break;
        case 51: 
          {  return symbol(sym.IF);  }
        case 115: break;
        case 54: 
          {  return symbol(sym.DO);  }
        case 116: break;
        case 64: 
          {  return symbol(sym.END);  }
        case 117: break;
        case 65: 
          {  return symbol(sym.FUN);  }
        case 118: break;
        case 70: 
          {  return symbol(sym.NOT);  }
        case 119: break;
        case 71: 
          {  return symbol(sym.INT);  }
        case 120: break;
        case 76: 
          {  return symbol(sym.VAR);  }
        case 121: break;
        case 97: 
          {  return symbol(sym.PRINT);  }
        case 122: break;
        case 96: 
          {  return symbol(sym.BEGIN);  }
        case 123: break;
        case 95: 
          {  return symbol(sym.WHILE);  }
        case 124: break;
        case 94: 
          {  return symbol(sym.FLOOR);  }
        case 125: break;
        case 93: 
          {  return symbol(sym.FLOAT);  }
        case 126: break;
        case 91: 
          {  return symbol(sym.CEIL);  }
        case 127: break;
        case 89: 
          {  return symbol(sym.BOOL);  }
        case 128: break;
        case 85: 
          {  return symbol(sym.SIZE);  }
        case 129: break;
        case 26: 
          {  return symbol(sym.SRPAR);  }
        case 130: break;
        case 25: 
          {  return symbol(sym.SLPAR);  }
        case 131: break;
        case 24: 
          {  return symbol(sym.CRPAR);  }
        case 132: break;
        case 23: 
          {  return symbol(sym.CLPAR);  }
        case 133: break;
        case 22: 
          {  return symbol(sym.RPAR);  }
        case 134: break;
        case 21: 
          {  return symbol(sym.LPAR);  }
        case 135: break;
        case 20: 
          {  return symbol(sym.COLON);  }
        case 136: break;
        case 17: 
          {  return symbol(sym.EQUAL);  }
        case 137: break;
        case 28: 
          {  return symbol(sym.COMMA);  }
        case 138: break;
        case 36: 
          {  terminate();  }
        case 139: break;
        case 78: 
          {  return symbol(sym.THEN);  }
        case 140: break;
        case 80: 
          {  return symbol(sym.REAL);  }
        case 141: break;
        case 81: 
          {  return symbol(sym.READ);  }
        case 142: break;
        case 82: 
          {  return symbol(sym.ELSE);  }
        case 143: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbol(sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }
private void terminate() {
	// TODO Auto-generated method stub
	System.exit(0);
	
}


}
