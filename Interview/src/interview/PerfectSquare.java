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
public class PerfectSquare {
  public static boolean isPs(int a){
      if(a==1){
          return false;
      }
      else{
        for(int i=2;i<=a/2;i++){
            if(i*i==a)
                return true;
        }  
      }
      return false;
      
  }    
}
