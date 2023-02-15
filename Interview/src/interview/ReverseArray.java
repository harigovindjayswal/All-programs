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
public class ReverseArray {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        
        
        int front=0,rear=a.length-1;
        while(front<rear){
            int temp=a[front];
            a[front]=a[rear];
            a[rear]=temp;
            front++;
            rear--;
        }
        for(int p:a)
            System.out.println(p);
    }
}
