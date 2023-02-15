/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hari
 */
public class FileReaderTest {
    public static void main(String args[]) throws IOException{
        FileWriter fw=new FileWriter("newfile1.text");
        fw.write(65);
        FileReader fr=new FileReader("newfile1.text");
        int b;
        while((b=fr.read())!=-1){
            System.out.print((char)b);
           
        }
    }
}
