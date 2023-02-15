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
public class Armstrong {
    public static void main(String args[]){
        int num=2000;
        int num1=num;
        int count=0;
        int arm=0;
  while(num>0){
     num/=10;
     count++;
  }      
  num=num1;
  System.out.println(count);
  while(num>0){
      arm+=Math.pow(num%10, count);
      num/=10;
  }
  System.out.println(num1+"  "+arm);
}}
