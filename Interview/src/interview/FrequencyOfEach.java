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
public class FrequencyOfEach {
    public static void frequency(){
        Integer a[]={1,2,4,1,4,3};
       
        for(int i=0;i<a.length;i++){
             int f=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    f++;
                    a[j]=null;
                }
                
        }
            if(a[i]!=null && f>1)
                    System.out.println(a[i]+"   "+f);
              
        
    }
    }
}