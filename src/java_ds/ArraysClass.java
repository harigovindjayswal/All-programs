/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.Arrays;

/**
 *
 * @author hari
 */
public class ArraysClass {
    public static void main(String args[]){
        int a[]={1,2,4,5,2,3};
        Arrays.sort(a);
        System.out.println(Arrays.spliterator(a));
        System.out.println(Arrays.stream(a));
        System.out.println(Arrays.toString(a));
    }
}
