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
    /*Write a function that takes in a string of one or more words, and returns the same string, 
    but with all five or more letter words reverse (Just like the name of this Kata). 
    Strings passed in will consist of only letters and spaces. 
    Spaces will be included only when more than one word is present.
     */
public class SpinWords {

    public static String spinWords(String sentence) {
        String[] splitted = sentence.split(" ");
        StringBuilder results = new StringBuilder();
        String ready;
        for (String split : splitted) {
            if (split.length() >= 5) {
                results.append(reverseString(split)+" ");
            }
            else {
            results.append(split+" ");    
            }
        }
        ready = results.toString();
        return removeLastChar(ready);
    }
    
    private static String removeLastChar(String str) {
    return str.substring(0, str.length() - 1);
}
  
      static String reverseString(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Welcome";
        System.out.print(spinWords(str));
    }
}
