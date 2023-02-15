/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.util.Arrays;

/**
 *
 * @author hari
 */
public class MyString {
        public static int[] vovelConsonent(String s1){
            int count[]=new int[2];
            String s=s1.toLowerCase();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    count[0]++;
                }
                else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    count[1]++;
                }
            }
            return count;
        }   
  public static boolean isAnagram(String s1,String s2){
      if(s1.length()!=s2.length()){
          return false;
      }
      else{
          char[] c1=s1.toLowerCase().toCharArray();
          char[] c2=s2.toLowerCase().toCharArray();
          Arrays.sort(c1);
          Arrays.sort(c2);
          if(Arrays.equals(c1, c2)){
              return true;
          }
      }
      return false;
  }      
  
}
