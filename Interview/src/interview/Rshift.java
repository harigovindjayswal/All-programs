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
public class Rshift {
 public static int[] rShift(int a[]){
     for(int i=a.length-1;i>0;i--){
         int temp=a[i];
         a[i]=a[i-1];
         a[i-1]=temp;
     }
     return a;
 }    
}
