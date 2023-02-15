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
public class Fibonacci {

    static int a = 0;
    static int b = 01;
    static int c = 0;
    static int num = 5;

    static void fibo(int n) {
        if (n == 0) {
            System.exit(1);
        } else {
            c = a + b;
            a = b;
            b = c;
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(1);
            } else {
                System.out.println(c);
            }
            fibo(n - 1);
        }

    }

    public static void main(String args[]) {
        fibo(7);

    }
}
