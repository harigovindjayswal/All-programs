/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.ArrayList;

/**
 *
 * @author hari
 */
public class ArrayListAccess {
    public static void main(String args[]){
        ArrayList<String> comp=new ArrayList<String>();
        System.out.println(comp.isEmpty());
        comp.add("Apple");
        comp.add("Amazon");
        comp.add("Google");
        comp.add("Walmart");
        comp.add("Infosys");
        comp.add("Wipro");
        System.out.println(comp);
        System.out.println(comp.size());
        //comp.add(99,"IBM");
        System.out.println(comp.size());
        comp.set(1, "MicroSoft");
    }
}
