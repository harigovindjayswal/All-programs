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
public class StringInNParts {
    public static String[] nParts(String s,int n){
        String s1[]=new String[n];
        if(s.length()%n!=0){
          System.out.println("can not devide ");
      }
      else{
          int j=0;
          int ts=s.length()/n;
          
          for(int i=0;i<s.length();i+=ts){
              
              s1[j]=s.substring(i,i+ts);
              j++;
          }
         
      }
         return s1;
    }
}
