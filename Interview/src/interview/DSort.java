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
public class DSort {
     public static int[] dSort(int a[]){
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]<a[j]){
                     int temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
             }
         }
         return a;
     }    
}
