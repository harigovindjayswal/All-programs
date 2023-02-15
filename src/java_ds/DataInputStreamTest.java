/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author hari
 */
public class DataInputStreamTest {
public static void main(String args[]) throws IOException{
   DataInputStream dis=new DataInputStream(System.in);
  String a=dis.readLine();
  int b=Integer.parseInt(dis.readLine());
 System.out.flush();
 int c=dis.readInt();
   System.out.println(a+" "+b+" "+c);
}    
}
