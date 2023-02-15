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
public class CompareObjects {
    int id;
    String name;

    public CompareObjects(int id, String name) {
        this.id = id;
        this.name = name;
    }

        public int hashCode(){
            return this.id*17;
        }
     public boolean equals(CompareObjects ob){
         //CompareObjects ob=(CompareObjects)o;
         if(this.id==ob.id)
             return true;
         else 
             return false;
     }
    
    
}
