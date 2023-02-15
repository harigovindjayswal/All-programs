/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hari
 */
public class FileInputStreamTest {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fis=new FileInputStream("Vargs.class");
        int b;
        System.out.println(fis.available());
        while((b=fis.read())!=-1){
            System.out.println(b);
        }
    }
}
