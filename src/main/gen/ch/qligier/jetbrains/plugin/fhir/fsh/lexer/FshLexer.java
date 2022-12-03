/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

// Copyright 2022 Quentin Ligier. Use of this source code is governed by the MIT license
package ch.qligier.jetbrains.plugin.fhir.fsh.lexer;

import ch.qligier.jetbrains.plugin.fhir.fsh.parser.psi.FshTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Fsh.flex</tt>
 */
class FshLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\51\1\52\1\1\22\0\1\3\1\0\1\47\1\46\1\44\2\0\1\53\1\72\1\73"+
    "\1\5\1\56\1\70\1\41\1\54\1\4\12\43\1\45\2\0\1\67\1\71\2\0\1\57\1\12\1\40\1"+
    "\13\1\61\3\12\1\62\2\12\1\64\1\6\1\12\1\66\1\60\1\12\1\37\1\7\1\11\1\10\1"+
    "\63\1\12\1\65\1\12\1\55\1\74\1\50\1\75\1\76\1\12\1\0\1\16\1\12\1\33\1\24\1"+
    "\14\1\23\1\42\1\35\1\30\2\12\1\21\1\17\1\26\1\32\1\20\1\12\1\22\1\27\1\25"+
    "\1\31\1\36\1\12\1\15\1\34\1\12\1\0\1\77\10\0\1\51\32\0\1\3\207\0\2\51\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\13\4\1\5\1\1"+
    "\1\6\1\7\2\1\1\10\1\11\7\4\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\0\1\22"+
    "\2\0\14\4\1\23\1\5\2\0\1\24\2\0\1\25"+
    "\1\26\4\4\1\27\4\4\1\30\2\22\2\0\1\30"+
    "\15\4\1\5\4\0\2\24\2\0\1\31\1\24\12\4"+
    "\1\0\1\32\7\4\1\0\5\4\1\5\2\0\1\31"+
    "\1\24\2\0\1\31\15\4\1\33\1\4\1\34\1\4"+
    "\1\35\1\4\1\0\5\4\1\5\1\36\3\0\1\31"+
    "\1\37\10\4\1\40\2\4\1\41\1\42\1\4\1\0"+
    "\3\4\1\0\1\4\1\0\1\36\1\0\1\43\1\44"+
    "\7\4\1\45\2\4\1\0\1\4\1\46\1\4\1\0"+
    "\1\4\2\0\1\47\5\4\1\50\1\51\1\4\1\52"+
    "\1\53\2\4\1\36\1\43\2\4\1\54\1\4\1\55"+
    "\3\4\1\0\1\4\1\56\1\4\1\57\1\4\1\60"+
    "\1\4\1\36\1\61\1\62\1\63\4\4\2\0\1\4"+
    "\2\0\1\4\1\64\3\0\1\64\2\0\1\64\1\0"+
    "\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\100\0\200\0\300\0\100\0\u0100\0\u0140\0\u0180"+
    "\0\u01c0\0\u0200\0\u0240\0\u0280\0\u02c0\0\u0300\0\u0340\0\u0380"+
    "\0\u03c0\0\u0200\0\100\0\100\0\u0400\0\u0440\0\u0480\0\100"+
    "\0\u04c0\0\u0500\0\u0540\0\u0580\0\u05c0\0\u0600\0\u0640\0\100"+
    "\0\100\0\100\0\100\0\100\0\100\0\100\0\100\0\u0680"+
    "\0\u06c0\0\u0700\0\u0740\0\u0780\0\u07c0\0\u0800\0\u0840\0\u0880"+
    "\0\u08c0\0\u0900\0\u0940\0\u0980\0\u09c0\0\u0a00\0\u0a40\0\100"+
    "\0\u0a80\0\u0ac0\0\u0b00\0\u0b40\0\u0b80\0\u0440\0\100\0\100"+
    "\0\u0bc0\0\u0c00\0\u0c40\0\u0c80\0\u0200\0\u0cc0\0\u0d00\0\u0d40"+
    "\0\u0d80\0\100\0\u0dc0\0\100\0\u0e00\0\u0e40\0\u0680\0\u0e80"+
    "\0\u0ec0\0\u0f00\0\u0f40\0\u0f80\0\u0fc0\0\u1000\0\u1040\0\u1080"+
    "\0\u10c0\0\u1100\0\u1140\0\u1180\0\u11c0\0\u1200\0\u1240\0\u1280"+
    "\0\u12c0\0\u1300\0\100\0\u1340\0\u1300\0\u1380\0\u0ac0\0\u13c0"+
    "\0\u1400\0\u1440\0\u1480\0\u14c0\0\u1500\0\u1540\0\u1580\0\u15c0"+
    "\0\u1600\0\u1640\0\100\0\u1680\0\u16c0\0\u1700\0\u1740\0\u1780"+
    "\0\u17c0\0\u1800\0\u1840\0\u1880\0\u18c0\0\u1900\0\u1940\0\u1980"+
    "\0\u19c0\0\u1a00\0\u1a40\0\u1300\0\u0b00\0\u1380\0\u1a80\0\u1ac0"+
    "\0\u1b00\0\u1b40\0\u1b80\0\u1bc0\0\u1c00\0\u1c40\0\u1c80\0\u1cc0"+
    "\0\u1d00\0\u1d40\0\u1d80\0\u1dc0\0\u1e00\0\u0200\0\u1e40\0\u0200"+
    "\0\u1e80\0\u1840\0\u1ec0\0\u1f00\0\u1f40\0\u1f80\0\u1fc0\0\u2000"+
    "\0\u2040\0\u2080\0\u20c0\0\u2100\0\u2140\0\u1ac0\0\u2180\0\u0200"+
    "\0\u21c0\0\u2200\0\u2240\0\u2280\0\u22c0\0\u2300\0\u2340\0\u2380"+
    "\0\u0200\0\u23c0\0\u2400\0\u0200\0\u0200\0\u2440\0\u2480\0\u24c0"+
    "\0\u2500\0\u2540\0\u2580\0\u25c0\0\u2600\0\100\0\u2640\0\u2180"+
    "\0\u0200\0\u2680\0\u26c0\0\u2700\0\u2740\0\u2780\0\u27c0\0\u2800"+
    "\0\u0200\0\u2840\0\u2880\0\u28c0\0\u2900\0\u0200\0\u2940\0\u2980"+
    "\0\u29c0\0\u2a00\0\u2a40\0\u0200\0\u2a80\0\u2ac0\0\u2b00\0\u2b40"+
    "\0\u2b80\0\u0200\0\u0200\0\u2bc0\0\u28c0\0\u0200\0\u2c00\0\u2c40"+
    "\0\u2c80\0\u2a40\0\u2cc0\0\u2d00\0\u2d40\0\u2d80\0\u0200\0\u2dc0"+
    "\0\u2e00\0\u2e40\0\u2e80\0\u2ec0\0\u0200\0\u2f00\0\u0200\0\u2f40"+
    "\0\u0200\0\u2f80\0\u2fc0\0\u0200\0\u0200\0\u0200\0\u3000\0\u3040"+
    "\0\u3080\0\u30c0\0\u3100\0\u3140\0\u3180\0\u31c0\0\u3200\0\u3240"+
    "\0\u3280\0\u32c0\0\u3300\0\u3340\0\100\0\u3380\0\u33c0\0\u3400"+
    "\0\u3440\0\u3480";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\15\12\1\14\3\12\1\15\1\12\1\16"+
    "\1\17\1\20\1\12\1\21\1\22\1\23\1\24\1\25"+
    "\2\2\1\3\1\26\1\27\1\12\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\12\1\40\1\41"+
    "\1\2\1\42\1\43\1\44\1\45\1\46\1\47\101\0"+
    "\3\3\46\0\1\3\25\0\1\50\2\0\1\50\1\51"+
    "\1\52\42\50\1\53\27\50\6\0\10\12\1\54\25\12"+
    "\11\0\1\12\1\0\10\12\17\0\6\12\1\55\15\12"+
    "\1\56\11\12\11\0\1\12\1\0\10\12\17\0\21\12"+
    "\1\57\14\12\11\0\1\12\1\0\10\12\17\0\10\12"+
    "\1\60\11\12\1\61\13\12\11\0\1\12\1\0\10\12"+
    "\17\0\36\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\62\27\12\11\0\1\12\1\0\10\12\17\0\14\12"+
    "\1\63\21\12\11\0\1\12\1\0\10\12\17\0\17\12"+
    "\1\64\16\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\65\14\12\1\66\12\12\11\0\1\12\1\0\10\12"+
    "\17\0\24\12\1\67\11\12\11\0\1\12\1\0\10\12"+
    "\17\0\36\12\11\0\1\12\1\0\10\12\2\0\1\70"+
    "\14\0\35\12\1\71\11\0\1\12\1\0\10\12\11\0"+
    "\1\72\2\0\1\73\43\72\1\74\1\75\1\72\1\73"+
    "\25\72\50\76\1\0\2\76\1\77\24\76\54\0\1\100"+
    "\31\0\13\12\1\101\22\12\11\0\1\12\1\0\10\12"+
    "\17\0\10\12\1\102\3\12\1\103\21\12\11\0\1\12"+
    "\1\0\10\12\17\0\7\12\1\104\26\12\11\0\1\12"+
    "\1\0\10\12\17\0\16\12\1\105\1\12\1\106\15\12"+
    "\11\0\1\12\1\0\10\12\17\0\10\12\1\107\25\12"+
    "\11\0\1\12\1\0\10\12\17\0\24\12\1\110\11\12"+
    "\11\0\1\12\1\0\10\12\17\0\36\12\11\0\1\12"+
    "\1\0\1\12\1\111\6\12\11\0\1\50\2\0\1\50"+
    "\1\112\43\50\1\53\27\50\1\51\1\113\1\114\75\51"+
    "\5\115\1\116\72\115\1\50\2\0\1\50\1\117\43\50"+
    "\1\53\27\50\6\0\12\12\1\120\23\12\11\0\1\12"+
    "\1\0\10\12\17\0\30\12\1\121\5\12\11\0\1\12"+
    "\1\0\10\12\17\0\23\12\1\122\12\12\11\0\1\12"+
    "\1\0\10\12\17\0\10\12\1\123\25\12\11\0\1\12"+
    "\1\0\10\12\17\0\14\12\1\124\21\12\11\0\1\12"+
    "\1\0\10\12\17\0\17\12\1\125\16\12\11\0\1\12"+
    "\1\0\10\12\17\0\21\12\1\126\14\12\11\0\1\12"+
    "\1\0\10\12\17\0\20\12\1\127\15\12\11\0\1\12"+
    "\1\0\10\12\17\0\17\12\1\130\16\12\11\0\1\12"+
    "\1\0\10\12\17\0\21\12\1\131\14\12\11\0\1\12"+
    "\1\0\10\12\17\0\13\12\1\132\22\12\11\0\1\12"+
    "\1\0\10\12\17\0\16\12\1\133\17\12\11\0\1\12"+
    "\1\0\10\12\17\0\33\12\1\134\1\12\1\135\1\0"+
    "\1\136\7\0\1\12\1\137\10\12\11\0\1\72\2\140"+
    "\1\141\43\72\1\142\1\75\1\72\1\141\25\72\1\73"+
    "\2\0\44\73\1\143\1\144\27\73\1\145\3\140\43\145"+
    "\1\146\2\145\1\140\25\145\1\72\2\140\1\141\43\72"+
    "\1\147\1\75\1\72\1\141\25\72\6\0\22\12\1\150"+
    "\13\12\11\0\1\12\1\0\10\12\17\0\14\12\1\151"+
    "\21\12\11\0\1\12\1\0\10\12\17\0\24\12\1\152"+
    "\11\12\11\0\1\12\1\0\10\12\17\0\12\12\1\153"+
    "\4\12\1\154\16\12\11\0\1\12\1\0\10\12\17\0"+
    "\21\12\1\155\6\12\1\156\5\12\11\0\1\12\1\0"+
    "\10\12\17\0\13\12\1\157\22\12\11\0\1\12\1\0"+
    "\10\12\17\0\34\12\1\160\1\12\11\0\1\12\1\0"+
    "\10\12\17\0\10\12\1\161\25\12\11\0\1\12\1\0"+
    "\10\12\13\0\1\114\75\0\5\115\1\162\72\115\4\0"+
    "\1\163\1\116\100\0\12\12\1\164\23\12\11\0\1\12"+
    "\1\0\10\12\17\0\6\12\1\165\27\12\11\0\1\12"+
    "\1\0\10\12\17\0\14\12\1\166\21\12\11\0\1\12"+
    "\1\0\10\12\17\0\34\12\1\167\1\12\11\0\1\12"+
    "\1\0\10\12\17\0\34\12\1\170\1\12\11\0\1\12"+
    "\1\0\10\12\17\0\13\12\1\171\22\12\11\0\1\12"+
    "\1\0\10\12\17\0\25\12\1\172\10\12\11\0\1\12"+
    "\1\0\10\12\17\0\36\12\1\0\1\173\7\0\1\12"+
    "\1\0\10\12\17\0\12\12\1\174\23\12\11\0\1\12"+
    "\1\0\10\12\17\0\24\12\1\175\11\12\11\0\1\12"+
    "\1\0\10\12\17\0\6\12\1\176\27\12\11\0\1\12"+
    "\1\0\10\12\17\0\6\12\1\177\27\12\11\0\1\12"+
    "\1\0\10\12\17\0\35\12\1\200\11\0\1\12\1\0"+
    "\10\12\17\0\35\12\1\201\11\0\1\12\1\0\10\12"+
    "\54\0\1\202\77\0\1\203\34\0\1\145\3\0\46\145"+
    "\1\0\25\145\1\72\2\0\1\73\43\72\1\142\1\75"+
    "\1\72\1\73\25\72\1\145\3\140\43\145\1\204\2\145"+
    "\1\140\25\145\1\73\2\0\44\73\1\205\1\144\27\73"+
    "\1\206\2\140\1\207\43\206\1\210\1\206\1\145\1\140"+
    "\25\206\6\0\10\12\1\211\25\12\11\0\1\12\1\0"+
    "\10\12\17\0\6\12\1\212\27\12\11\0\1\12\1\0"+
    "\10\12\17\0\15\12\1\213\20\12\11\0\1\12\1\0"+
    "\10\12\17\0\14\12\1\214\21\12\11\0\1\12\1\0"+
    "\10\12\17\0\6\12\1\215\27\12\11\0\1\12\1\0"+
    "\10\12\17\0\17\12\1\216\16\12\11\0\1\12\1\0"+
    "\10\12\17\0\10\12\1\217\25\12\11\0\1\12\1\0"+
    "\10\12\17\0\23\12\1\220\12\12\11\0\1\12\1\0"+
    "\10\12\17\0\22\12\1\221\13\12\11\0\1\12\1\0"+
    "\10\12\17\0\17\12\1\222\16\12\11\0\1\12\1\0"+
    "\10\12\11\0\4\115\1\163\1\162\72\115\6\0\22\12"+
    "\1\223\13\12\11\0\1\12\1\0\10\12\17\0\14\12"+
    "\1\224\21\12\11\0\1\12\1\0\10\12\17\0\25\12"+
    "\1\225\10\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\226\27\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\227\27\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\230\27\12\11\0\1\12\1\0\10\12\17\0\14\12"+
    "\1\231\21\12\11\0\1\12\1\0\10\12\11\0\1\232"+
    "\3\0\42\232\1\0\3\232\1\0\25\232\6\0\21\12"+
    "\1\233\14\12\1\0\1\234\7\0\1\12\1\0\10\12"+
    "\17\0\23\12\1\235\12\12\11\0\1\12\1\0\10\12"+
    "\17\0\1\12\1\236\34\12\11\0\1\12\1\0\10\12"+
    "\17\0\1\12\1\237\34\12\11\0\1\12\1\0\10\12"+
    "\17\0\35\12\1\240\11\0\1\12\1\0\10\12\17\0"+
    "\33\12\1\241\1\12\1\242\11\0\1\12\1\0\10\12"+
    "\54\0\1\243\77\0\1\244\34\0\1\206\2\0\1\245"+
    "\43\206\1\246\1\206\1\145\1\0\26\206\2\140\1\207"+
    "\43\206\1\247\1\206\1\145\1\140\25\206\6\0\21\12"+
    "\1\250\14\12\11\0\1\12\1\0\10\12\17\0\20\12"+
    "\1\251\15\12\11\0\1\12\1\0\10\12\17\0\22\12"+
    "\1\252\13\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\253\27\12\11\0\1\12\1\0\10\12\17\0\20\12"+
    "\1\254\15\12\11\0\1\12\1\0\10\12\17\0\10\12"+
    "\1\255\25\12\11\0\1\12\1\0\10\12\17\0\14\12"+
    "\1\256\21\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\257\27\12\11\0\1\12\1\0\10\12\17\0\25\12"+
    "\1\260\10\12\11\0\1\12\1\0\10\12\17\0\27\12"+
    "\1\261\6\12\11\0\1\12\1\0\10\12\17\0\20\12"+
    "\1\262\15\12\11\0\1\12\1\0\10\12\17\0\22\12"+
    "\1\263\13\12\11\0\1\12\1\0\10\12\17\0\6\12"+
    "\1\264\27\12\11\0\1\12\1\0\10\12\17\0\17\12"+
    "\1\265\16\12\11\0\1\12\1\0\10\12\17\0\22\12"+
    "\1\266\13\12\11\0\1\12\1\0\10\12\17\0\36\12"+
    "\1\0\1\234\7\0\1\12\1\0\10\12\15\0\1\267"+
    "\101\0\14\12\1\270\21\12\11\0\1\12\1\0\10\12"+
    "\17\0\6\12\1\271\27\12\11\0\1\12\1\0\10\12"+
    "\17\0\26\12\1\272\7\12\11\0\1\12\1\0\10\12"+
    "\17\0\36\12\1\0\1\273\7\0\1\12\1\0\10\12"+
    "\17\0\35\12\1\274\11\0\1\12\1\0\10\12\17\0"+
    "\35\12\1\242\11\0\1\12\1\0\10\12\52\0\1\137"+
    "\3\0\1\275\7\0\1\276\1\137\66\0\1\273\32\0"+
    "\1\245\2\0\44\245\1\277\1\245\2\0\25\245\1\206"+
    "\2\140\1\207\43\206\1\300\1\206\1\145\1\140\25\206"+
    "\6\0\17\12\1\301\16\12\11\0\1\12\1\0\10\12"+
    "\17\0\13\12\1\302\22\12\11\0\1\12\1\0\10\12"+
    "\17\0\21\12\1\303\14\12\11\0\1\12\1\0\10\12"+
    "\17\0\21\12\1\304\14\12\11\0\1\12\1\0\10\12"+
    "\17\0\20\12\1\305\15\12\11\0\1\12\1\0\10\12"+
    "\17\0\22\12\1\306\13\12\11\0\1\12\1\0\10\12"+
    "\17\0\1\12\1\307\34\12\11\0\1\12\1\0\10\12"+
    "\17\0\10\12\1\310\25\12\11\0\1\12\1\0\10\12"+
    "\17\0\34\12\1\311\1\12\11\0\1\12\1\0\10\12"+
    "\17\0\17\12\1\312\16\12\11\0\1\12\1\0\10\12"+
    "\17\0\12\12\1\313\23\12\11\0\1\12\1\0\10\12"+
    "\15\0\1\314\101\0\25\12\1\315\10\12\11\0\1\12"+
    "\1\0\10\12\17\0\17\12\1\316\16\12\11\0\1\12"+
    "\1\0\10\12\17\0\21\12\1\317\14\12\11\0\1\12"+
    "\1\0\10\12\54\0\1\320\42\0\35\12\1\321\11\0"+
    "\1\12\1\0\10\12\54\0\1\322\34\0\1\245\2\0"+
    "\44\245\1\323\1\245\2\0\25\245\6\0\6\12\1\324"+
    "\27\12\11\0\1\12\1\0\10\12\17\0\21\12\1\325"+
    "\14\12\11\0\1\12\1\0\10\12\17\0\22\12\1\326"+
    "\13\12\11\0\1\12\1\0\10\12\17\0\25\12\1\327"+
    "\10\12\11\0\1\12\1\0\10\12\17\0\10\12\1\330"+
    "\25\12\11\0\1\12\1\0\10\12\17\0\6\12\1\331"+
    "\27\12\11\0\1\12\1\0\10\12\17\0\13\12\1\332"+
    "\22\12\11\0\1\12\1\0\10\12\17\0\26\12\1\333"+
    "\7\12\11\0\1\12\1\0\10\12\17\0\17\12\1\334"+
    "\16\12\11\0\1\12\1\0\10\12\11\0\1\335\3\0"+
    "\42\335\1\0\3\335\1\0\25\335\6\0\6\12\1\336"+
    "\27\12\11\0\1\12\1\0\10\12\17\0\17\12\1\337"+
    "\16\12\11\0\1\12\1\0\10\12\54\0\1\276\42\0"+
    "\33\12\1\340\2\12\11\0\1\12\1\0\10\12\54\0"+
    "\1\341\34\0\1\245\2\0\44\245\1\342\1\245\2\0"+
    "\25\245\6\0\22\12\1\343\13\12\11\0\1\12\1\0"+
    "\10\12\17\0\24\12\1\344\11\12\11\0\1\12\1\0"+
    "\10\12\17\0\6\12\1\345\27\12\11\0\1\12\1\0"+
    "\10\12\17\0\20\12\1\346\15\12\11\0\1\12\1\0"+
    "\10\12\17\0\17\12\1\347\16\12\11\0\1\12\1\0"+
    "\10\12\17\0\22\12\1\350\13\12\11\0\1\12\1\0"+
    "\10\12\17\0\6\12\1\351\27\12\11\0\1\12\1\0"+
    "\10\12\17\0\35\12\1\352\11\0\1\12\1\0\10\12"+
    "\52\0\1\137\12\0\1\353\1\276\1\137\27\0\24\12"+
    "\1\354\11\12\11\0\1\12\1\0\10\12\17\0\20\12"+
    "\1\355\15\12\11\0\1\12\1\0\10\12\17\0\36\12"+
    "\11\0\1\12\1\0\7\12\1\356\17\0\17\12\1\357"+
    "\16\12\11\0\1\12\1\0\10\12\17\0\24\12\1\360"+
    "\11\12\11\0\1\12\1\0\10\12\17\0\11\12\1\361"+
    "\24\12\11\0\1\12\1\0\10\12\17\0\35\12\1\362"+
    "\11\0\1\12\1\0\10\12\54\0\1\363\42\0\20\12"+
    "\1\364\15\12\11\0\1\12\1\0\10\12\17\0\15\12"+
    "\1\365\20\12\11\0\1\12\1\0\10\12\17\0\20\12"+
    "\1\366\15\12\11\0\1\12\1\0\10\12\17\0\3\12"+
    "\1\367\32\12\11\0\1\12\1\0\10\12\52\0\1\137"+
    "\1\0\1\363\11\0\1\276\1\137\27\0\35\12\1\370"+
    "\11\0\1\12\1\0\10\12\17\0\35\12\1\371\11\0"+
    "\1\12\1\0\10\12\17\0\33\12\1\372\2\12\1\0"+
    "\1\373\7\0\1\12\1\374\10\12\17\0\35\12\1\375"+
    "\11\0\1\12\1\0\10\12\54\0\1\376\77\0\1\377"+
    "\42\0\35\12\1\u0100\11\0\1\12\1\0\10\12\54\0"+
    "\1\u0101\77\0\1\u0102\42\0\36\12\1\0\1\u0103\7\0"+
    "\1\12\1\0\10\12\52\0\1\374\3\0\1\u0104\7\0"+
    "\1\u0105\1\374\66\0\1\u0103\75\0\1\u0106\77\0\1\u0107"+
    "\77\0\1\u0105\77\0\1\u0108\75\0\1\374\12\0\1\u0109"+
    "\1\u0105\1\374\64\0\1\u010a\75\0\1\374\1\0\1\u010a"+
    "\11\0\1\u0105\1\374\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13504];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\15\1\2\11\3\1\1\11"+
    "\7\1\10\11\1\0\1\1\2\0\14\1\1\11\1\1"+
    "\2\0\1\1\2\0\2\11\11\1\1\11\1\1\1\11"+
    "\2\0\17\1\4\0\1\1\1\11\2\0\14\1\1\0"+
    "\1\11\7\1\1\0\6\1\2\0\2\1\2\0\24\1"+
    "\1\0\7\1\3\0\20\1\1\0\3\1\1\0\1\1"+
    "\1\0\1\11\1\0\14\1\1\0\3\1\1\0\1\1"+
    "\2\0\27\1\1\0\17\1\2\0\1\1\2\0\2\1"+
    "\3\0\1\11\2\0\1\1\1\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[266];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FshLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
              {
                return null;
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 53: break;
          case 2: 
            { return FshTypes.WHITESPACE;
            } 
            // fall through
          case 54: break;
          case 3: 
            { return FshTypes.STAR;
            } 
            // fall through
          case 55: break;
          case 4: 
            { return FshTypes.IDENTIFIER;
            } 
            // fall through
          case 56: break;
          case 5: 
            { return FshTypes.DIGIT;
            } 
            // fall through
          case 57: break;
          case 6: 
            { return FshTypes.COLON;
            } 
            // fall through
          case 58: break;
          case 7: 
            { return FshTypes.HASH;
            } 
            // fall through
          case 59: break;
          case 8: 
            { return FshTypes.DOT;
            } 
            // fall through
          case 60: break;
          case 9: 
            { return FshTypes.PLUS;
            } 
            // fall through
          case 61: break;
          case 10: 
            { return FshTypes.EQUAL;
            } 
            // fall through
          case 62: break;
          case 11: 
            { return FshTypes.COMMA;
            } 
            // fall through
          case 63: break;
          case 12: 
            { return FshTypes.LEFTPAREN;
            } 
            // fall through
          case 64: break;
          case 13: 
            { return FshTypes.RIGHTPAREN;
            } 
            // fall through
          case 65: break;
          case 14: 
            { return FshTypes.LEFTBRACKET;
            } 
            // fall through
          case 66: break;
          case 15: 
            { return FshTypes.RIGHTBRACKET;
            } 
            // fall through
          case 67: break;
          case 16: 
            { return FshTypes.CARET;
            } 
            // fall through
          case 68: break;
          case 17: 
            { return FshTypes.PIPE;
            } 
            // fall through
          case 69: break;
          case 18: 
            { return FshTypes.LINECOMMENT;
            } 
            // fall through
          case 70: break;
          case 19: 
            { return FshTypes.ARROW;
            } 
            // fall through
          case 71: break;
          case 20: 
            { return FshTypes.STRING;
            } 
            // fall through
          case 72: break;
          case 21: 
            { return FshTypes.UNIT;
            } 
            // fall through
          case 73: break;
          case 22: 
            { return FshTypes.DOUBLEDOT;
            } 
            // fall through
          case 74: break;
          case 23: 
            { return FshTypes.KWID;
            } 
            // fall through
          case 75: break;
          case 24: 
            { return FshTypes.REGEX;
            } 
            // fall through
          case 76: break;
          case 25: 
            { return FshTypes.CONCEPTSTRING;
            } 
            // fall through
          case 77: break;
          case 26: 
            { return FshTypes.BLOCKCOMMENT;
            } 
            // fall through
          case 78: break;
          case 27: 
            { return FshTypes.KWUSAGE;
            } 
            // fall through
          case 79: break;
          case 28: 
            { return FshTypes.KWTITLE;
            } 
            // fall through
          case 80: break;
          case 29: 
            { return FshTypes.URN;
            } 
            // fall through
          case 81: break;
          case 30: 
            { return FshTypes.TIME;
            } 
            // fall through
          case 82: break;
          case 31: 
            { return FshTypes.KWALIAS;
            } 
            // fall through
          case 83: break;
          case 32: 
            { return FshTypes.KWXPATH;
            } 
            // fall through
          case 84: break;
          case 33: 
            { return FshTypes.KWSOURCE;
            } 
            // fall through
          case 85: break;
          case 34: 
            { return FshTypes.KWTARGET;
            } 
            // fall through
          case 86: break;
          case 35: 
            { return FshTypes.MULTILINESTRING;
            } 
            // fall through
          case 87: break;
          case 36: 
            { return FshTypes.KWPARENT;
            } 
            // fall through
          case 88: break;
          case 37: 
            { return FshTypes.KWMAPPING;
            } 
            // fall through
          case 89: break;
          case 38: 
            { return FshTypes.KWRULESET;
            } 
            // fall through
          case 90: break;
          case 39: 
            { return FshTypes.KWPROFILE;
            } 
            // fall through
          case 91: break;
          case 40: 
            { return FshTypes.KWLOGICAL;
            } 
            // fall through
          case 92: break;
          case 41: 
            { return FshTypes.KWSEVERITY;
            } 
            // fall through
          case 93: break;
          case 42: 
            { return FshTypes.URL;
            } 
            // fall through
          case 94: break;
          case 43: 
            { return FshTypes.KWRESOURCE;
            } 
            // fall through
          case 95: break;
          case 44: 
            { return FshTypes.KWINSTANCE;
            } 
            // fall through
          case 96: break;
          case 45: 
            { return FshTypes.KWVALUESET;
            } 
            // fall through
          case 97: break;
          case 46: 
            { return FshTypes.KWEXTENSION;
            } 
            // fall through
          case 98: break;
          case 47: 
            { return FshTypes.KWINVARIANT;
            } 
            // fall through
          case 99: break;
          case 48: 
            { return FshTypes.KWCODESYSTEM;
            } 
            // fall through
          case 100: break;
          case 49: 
            { return FshTypes.KWEXPRESSION;
            } 
            // fall through
          case 101: break;
          case 50: 
            { return FshTypes.KWINSTANCEOF;
            } 
            // fall through
          case 102: break;
          case 51: 
            { return FshTypes.KWDESCRIPTION;
            } 
            // fall through
          case 103: break;
          case 52: 
            { return FshTypes.DATETIME;
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
