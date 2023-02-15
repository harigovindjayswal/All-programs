/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ds;

/**
 *
 * @author hari
 */
public class BinarySearch {
    static int search(int a[], int k){
        int low=0,high=a.length-1,mid=0;
       
        while(low<=high){
           
            mid=(low+high)/2;
            if(a[mid]==k)
                return mid+1;
            else if(a[mid]>k)
                high=mid-1;
            else
                low=mid+1;
           
        }
         return -1;
    }
    public static void main(String args[]){
        int a[]={2,3,4,5,6,7};
         int k=10;
        
        System.out.println(search(a,k));
    }
}
