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
public class ShiftingElements {
    public static void shift(){
       int temp=0;
    int a[]={1,2,3,4};
    for(int i=0;i<a.length-1;i++){
     temp=a[i];
     a[i]=a[i+1];
     a[i+1]=temp; 
    }
    for(int i:a)
        System.out.print(i+" ");
    
}
}
