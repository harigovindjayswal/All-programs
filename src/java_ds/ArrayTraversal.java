package java_ds;

import java.util.Scanner;

public class ArrayTraversal {

    int a[] = new int[10];
    int size = 0;

    ArrayTraversal(int a[]) {
        this.a = a;
        size = a.length + 1;
    }

    public ArrayTraversal() {

    }

    void create(int size) {
        this.size = size;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
    }

    void insert(int loc, int value) {
        if (loc > 100 || loc < 0) {
            System.out.println("invaild location");

        } else {
            if (loc >= size) {
                a[loc] = value;
            } else {
                for (int i = 0; i < size - loc; i++) {
                    a[size - i] = a[size - 1 - i];

                }
                a[loc] = value;
                size++;
            }
        }
    }

    void delete(int loc) {
        if (loc == size) {
            a[loc] = 0;
        } else if (loc > size) {
            System.out.println("Data not found");
        } else {
            for (int i = 0; i < size - loc; i++) {
                a[loc + i] = a[loc + 1 + i];
            }

        }
    }
    void reverse(int length){
        int temp;
        if(length>1){
            temp=a[size-length];
            a[size-length]=a[length-1];
            a[length-1]=temp;
            reverse(length-1);
        }
    }

    void print() {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ArrayTraversal at = new ArrayTraversal();
        at.create(3);
        at.print();
        System.out.println();
        at.delete(1);
        at.print();
        at.reverse(3);
           System.out.println();
        at.print();
     
    }

}
