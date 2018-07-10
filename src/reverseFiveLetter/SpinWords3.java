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
import java.util.stream.*;
import java.util.Arrays;

public class SpinWords3 {

  public String spinWords3(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}
