/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basics_interview;

/**
 *
 * @author hari
 */
public class Pallindrome {
     static boolean isPallindrome(int n){
      int temp=n;
      int check=0;
      while(temp>0){
          int d=temp%10;
          check=check*10+d;
          temp/=10;
      }
      System.out.println(check);
      if(check==n)
          return true;
      else
          return false;
}    
}
