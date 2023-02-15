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
public class IdentityMat {
    public static void mat(){
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               
                if(a[i][j]!=0 && i!=j)
                    System.out.print(a[i][j]+" ");
                if(i==j)
                    System.out.print(a[i][j]);
            }
        }
    }    
}
