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
    
    public static void main(String[] args){
        
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b  = a.append("de");
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
}
