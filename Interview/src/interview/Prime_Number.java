/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hari
 */
public class Prime_Number {
   static boolean prime(int n){
       if(n==1){
           return false;
       }
       else if(n==2){
           return true;
       }
        int div=n/2;
        while(div>1){
            if(n%div==0){
               
                return false;
                
            }
            div--;
        }
        return true;
    }    
}
