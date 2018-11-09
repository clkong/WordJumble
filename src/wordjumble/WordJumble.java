/*
 *Sean Luo 09/11/2018
 *WordJumble.java
 *This is progrem calculates the WordJumble.
 */

package wordjumble;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String letters = JOptionPane.showInputDialog("Please enter a word");
    jumbleWords(letters, "");
  }

  public static void jumbleWords(String word, String jumbLet) {
    int pos;
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
      System.out.println(jumbLet + word);
    } else {
      for (pos = 0; pos < origWord.length(); pos++) {
        remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        jumbleWords(remainingLetters, 
          origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}
   
