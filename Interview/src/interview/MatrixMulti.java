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
public class MatrixMulti {
  public static int[][] mult(int a[][],int b[][]){
    int res[][]=new int[a.length][a.length];
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
               for(int k=0;k<a.length;k++){
                   res[i][j]+=a[i][k]*b[k][j];
               }
      }
         
  }
       return res;
}
}
  
