/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hari
 */
public class CalendarTest {
    public static void main(String args[]){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));
        calendar.set(calendar.HOUR,9);
        calendar.set(calendar.MINUTE, 22);
        calendar.set(calendar.SECOND,55);
          System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));
        System.out.println(calendar.getTime());
        
        calendar.add(calendar.DATE, 15);
        System.out.println(calendar.getTime());
        calendar.add(calendar.MONTH, 3);
        System.out.println(calendar.getTime());
        calendar.add(calendar.YEAR,2);
        System.out.println(calendar.getTime());
    }
}

Thank you for offering me an opportunity I 
sincerely appreciate your time and consideration. Required documents are attached. 
Degree not received yet.