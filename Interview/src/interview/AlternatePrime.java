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
public class AlternatePrime {
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    check = false;
                }
            }
        }
        return check;
    }

    public static void alterPrime(int count) {
        int temp = 1;
        for (int i = 1; true; i++) {
            if (isPrime(i)) {
                if (temp % 2 != 0) {
                    System.out.println(i);
                    if (count == 1) {
                        break;
                    }
                    count--;
                }
                temp++;

            }

        }
    }

}
