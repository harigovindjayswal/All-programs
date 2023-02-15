/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author hari
 */
public class EnumrationTest {
    public static void main(String args[]){
        Vector v=new Vector();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
