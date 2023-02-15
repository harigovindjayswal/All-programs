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
public class SwappingBitwise {
    public static void swap(int a,int b){
        System.out.println("before "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after "+a+" "+b);
    }
    public static void swapd(int a, int b){
        System.out.println("before "+a+" "+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("after "+a+" "+b);
    }
}
