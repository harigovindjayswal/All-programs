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
public class DupRemove {
public static Integer[] dupRemove(Integer a[]){
      for(int i=0;i<a.length-1;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[i]==a[j]){
                  for(int p=i;p<a.length-1;p++){
                     
                      a[p]=a[p+1];
                      
                  }
                  a[i]=null;
              }
          }
      }
      return a;
}    
}
