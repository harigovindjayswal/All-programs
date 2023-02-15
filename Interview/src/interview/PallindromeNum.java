/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Scanner;

/**
 *
 * @author hari
 */
public class PallindromeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int temp=0,reverse=0;
          int n=sc.nextInt();
          int n2=n;
          while(n2>0){
              temp=n2%10;
              n2/=10;
              reverse=(reverse*10)+temp;
              
          }
          System.out.println(reverse);
          if(reverse==n)
              System.out.println("Pallindrome");
          else
              System.out.println("Not Pallindrome");
    }
    
}
