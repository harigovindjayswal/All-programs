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
public class MatrixTranspose {
public static void transpose(int a[][]){
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[j][i]+" ");
        }
        System.out.println();
    }
}    
}
