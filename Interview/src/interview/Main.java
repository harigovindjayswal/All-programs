package interview;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import static javafx.scene.input.KeyCode.T;

class Check{
    final int a=8;
    void print(){
       
        System.out.println(a);
    }
}
public class Main {
       static int count=0;
       static void print(){
           count++;
           if(count<=5){
               System.out.println(count+" ");
               print();
           }
       }
    public static void main(String args[]) throws IOException {
   Check c=new Check();
   c.print();
   System.out.println(c.a);
    }
}


