/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_interview;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author hari
 */
public class Fibonacci_1 {
    public static void main(String args[]) throws IOException{
         DataInputStream ds=new DataInputStream(System.in);
        int a=0;
        int b=1;
        int fibo=0;
        int n=7;
        if(n==1){
            System.out.println(0);
            
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
            while(n>2){
                int temp=a+b;
                a=b;
                b=temp;
                fibo=temp;
                n--;
            }
            System.out.println(fibo);
        }
        
    }
}
