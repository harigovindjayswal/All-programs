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
public class Smallest {
    public static int small(int a,int b,int c){
            if(a<b && a<c)
                return a;
            else if(b<a && b<c)
                return b;
            else 
                return c;
    }
}
