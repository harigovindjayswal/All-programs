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
public class GCD {
     public static int hcf(int a,int b){
        int hcf=1;
        for(int i=2;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0)
            {
                hcf=i;
                break;
            }
        }
        System.out.println("lcm = "+a*b/hcf);
        return hcf;
    }
}
