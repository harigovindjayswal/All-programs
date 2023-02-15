/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.*;

/**
 *
 * @author hari
 */
public class ArrayInsertion {

    int x[] = new int[10];
    int size = 0;

    void create(int size) {
        this.size = size;
        if (size > 99) {
            System.out.println("Oveflows");

        } else {
            for (int i = 0; i < size; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter " + i + "th elements");
                x[i] = sc.nextInt();
            }

        }
    }

    void print() {
        for (int i : x) {
            System.out.println(i);
        }
    }

    void insert(int loc, int ele) {
        if (loc > 99) {
            System.out.println("Overflow");
        } else if (loc >= size) {
            System.out.println("out of range");
        } else {
            System.out.println("size  "+size);
            System.out.println("loc  "+loc);
            
            for (int i = size-1; i < loc; i--) {
                
                 x[i + 1] = x[i];
            }
            x[loc] = ele;
        }

    }

    public static void main(String args[]) {

        System.out.println("Enter size less than 100");
        Scanner sc = new Scanner(System.in);
        ArrayInsertion a = new ArrayInsertion();
        a.create(sc.nextInt());
        a.print();
        System.out.println("Enter location and elements to be inserted");
        a.insert(sc.nextInt(), sc.nextInt());
        a.print();

    }
}
