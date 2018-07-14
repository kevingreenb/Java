/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringBuilder;

/**
 *
 * @author KevinGreen
 */
public class stringBuilder {

    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");

        System.out.println(a);
        System.out.println(b);

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        String s3 = "Gato";
        s1.append(s2);
        s1.append("Gato");
        s1.substring(4);
        int foundAt = s1.indexOf("to");
        System.out.println(foundAt);

    }

}
