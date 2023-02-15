/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author hari
 */
public class LargestN {
    public static int larg(int a, int b, int c){
       return a>b?(a>c?a:c):(b>c?b:c);
    
    }
}
