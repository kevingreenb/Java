/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseFiveLetter;

/**
 *
 * @author KevinGreen
 */
import java.util.Arrays;
import static reverseFiveLetter.SpinWords.spinWords;

public class SpinWords2 {

  public String spinWords2(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
  
      public static void main(String[] args) {
        String str = "Welcome";
        System.out.print(spinWords(str));
    }
}
