package editorjavaffx;

/**
 * The purpose of this is to teach students to write to an interface, practice strings, and practice with a simple class. 
 *
 * @author Kyle Gillette
 */

public interface Ed
{
   String getBefore();
   String getAfter();
   Ed rightArrow();
   Ed leftArrow();
   Ed delete();
   Ed backspace();
   Ed insertString(char c);  // Originally insert(char c), which is fine if you teach the char type
   Ed homeKey();
   Ed endKey();
   String toString();
}