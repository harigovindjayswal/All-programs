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
public class N_Primes {
    public static void nPrime(int n){
        for(int i=2;i<=n;i++){
            if(i==2){
                System.out.println(i);
            }
            else{
                int div=i/2;
           boolean isprime=true;
         while(div>1){
                if(i%div==0)
                 isprime=false;
                div--;
            }
           if(isprime)
                System.out.println(i);
             }
           
         }
     }
}
