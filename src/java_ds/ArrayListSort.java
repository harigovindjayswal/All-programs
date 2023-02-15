/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;
import java.util.*;
/**
 *
 * @author hari
 */

public class ArrayListSort {
    public static void main(String args[]){
        ArrayList<Person> p=new ArrayList<Person>();
        p.add(new Person("raja",23));
        p.add(new Person("teja",53));
        p.add(new Person("Rahul",21));
        p.add(new Person("rinku",19));
        p.forEach((person) -> person.print());
       
    }
}
