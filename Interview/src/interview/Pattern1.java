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
public class Pattern1 {
   public static void p(){
       int i=0,j=0,k=0;
       for(i=0;i<5;i++){
           for(j=i;j>=0;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       for(i=0;i<5;i++){
           for(k=4-i;k>=0;k--){
               System.out.print(" ");
           }
           for(j=i;j>=0;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       for(i=0;i<5;i++){
           for(j=4-i;j>=0;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       for(i=0;i<5;i++){
           k+=i;
           while(k>=0){
               System.out.print(" ");
           k--;
           }
           for(j=4-i;j>=0;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       
   } 
}
