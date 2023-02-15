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
public class SquareRoot {
    public static double sqrt(int n){
        double t;
        double sqrt=n/2;
        do{
            t=sqrt;
            sqrt=(t+(n/t))/2;
        }while(t-sqrt!=0);
        return sqrt;
    }
}
