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
public class PallindromeString {
    public static void main(String args[]){
        String s="radar";
        StringBuilder sb=new StringBuilder();
       
       
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        String temp=sb.toString();
        if(temp.equals(s))
        System.out.println("Pallindrome");
        else
        System.out.println("Not");
                
    }
}
