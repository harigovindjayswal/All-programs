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
class Person implements Comparable{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Person() {
    }
    
    void print(){
        System.out.println(name+"  "+age);
    }
    
    int compareTo(Person p){
        if(age>p.age)
            return 1;
        else if(age<p.age)
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 class ForEach {
     public static void main(String args[]){
          ArrayList<Person> plist=new ArrayList<Person>();
          Person p=new Person("dinesh",24);
           plist.add(p);
           plist.add(new Person("ramesh",34));
           plist.add(new Person("raja",32));
           plist.add(new Person("rajesh",23));
           plist.forEach(pr->pr.print());
     }
   
    
}
