/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.EnumSet;
import java.util.Iterator;

/**
 *
 * @author hari
 */
public class EnumSetTest {
    public enum week {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thurseday,
        Friday,
        Saturday
    }
    public static void main(String args[]){
        EnumSet<week> a,b,c,d,e;
        a=EnumSet.allOf(week.class);
        b=EnumSet.of(week.Friday,week.Sunday);
        c=EnumSet.complementOf(b);
        d=EnumSet.noneOf(week.class);
        e=EnumSet.range(week.Monday, week.Friday);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        Iterator it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        
        }
        System.out.println();
        b.forEach(System.out::println);
    }
}
