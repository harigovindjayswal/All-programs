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
public class LCM {
  public static int lcm(int a, int b){
      int lcm=1;
      for(int i=1;i<=a && i<=b;i++){
          if(a%i==0 || b%i==0){
              lcm*=i;
          }
      }
      return lcm;
  }    
}
