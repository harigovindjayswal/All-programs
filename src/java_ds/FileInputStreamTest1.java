/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author hari
 */
public class FileInputStreamTest1 {
    public static void main(String args[]) throws IOException{
    FileOutputStream fos=new FileOutputStream("newfile.text");
    
    for(int i=0;i<256;i++){
        fos.write(i);
    }
    FileInputStream fis=new FileInputStream("newfile.text");
      int b;
      while((b=fis.read())!=-1){
          System.out.println(b+"  "+(char)b);
      }
    b=0;
    fis.close();
    FileInputStream fiss=new FileInputStream("newfile.text");
    FileOutputStream dest=new FileOutputStream("copy.text");
       while((b=fiss.read())!=fiss.available()/4){
           dest.write(b);
        
       }
     FileInputStream d=new FileInputStream("copy.text");
     b=0;
     while((b=d.read())!=-1){
         System.out.println(b+" -> "+(char)b);
     }
    }
    
}
