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
public class Bstree1<T extends Comparable<T>> {
    T data;
    Bstree1 left;
    Bstree1 right;

    public Bstree1() {
        this.data=null;
        this.left=null;
        this.right=null;
    }

    public Bstree1(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    void insert(T data){
        if(this.data.compareTo(data)>0){
            if(right==null){
                right=new Bstree1(data);
               
            }else{
                right.insert(data);
            }
        }
        else if(this.data.compareTo(data)<0){
            if(left==null){
                left=new Bstree1(data);
            }
            else{
                left.insert(data);
            }
        }
    }
    void visit(){
        System.out.println(this.data+" ");
    }
    static void inOrder(Bstree1 root){
        if(root!=null){
            root.inOrder(root.left);
            System.out.println(root.data);
            root.inOrder(root.right);
        }
            
    }
    static void preOrder(Bstree1 root){
        if(root!=null){
             root.visit();  
            root.preOrder(root.left);
            root.preOrder(root.right);
           
        }
    }
    static void postOrder(Bstree1 root){
        if(root!=null){
            
            root.postOrder(root.left);
            root.postOrder(root.right);
            root.visit();  
            
        }
    }
    T inSucc(Bstree1 root){
        T minv=this.data;
        while(root.right!=null){
            minv=(T) this.left.data;
            root=root.left;
            
        }
        return minv;
    }
    Bstree1 delete(Bstree1 root, T key){
    if(root==null)
        return root;
    if(root.data.compareTo(key)>0){
        root.right=delete(root.right,key);
    }
    else if(root.data.compareTo(key)<0){
        root.left=delete(root.left,key);
    }
    else{
        if(root.left==null)
            return root.right;
        else if(root.right==null)
            return root.left;
        root.data=inSucc(root.right);
        root.right=delete(root.right,this.data);
    }
    return root;
    
    }
    
    public static void main(String args[]){
       Bstree1<Integer> b=new Bstree1<>(6);
       b.insert(1);
       b.insert(2);
       b.insert(3);
       b.insert(4);
       b.insert(5);
       b.insert(6);
      inOrder(b);
      System.out.println();
      System.out.println();
      preOrder(b);
      System.out.println();
      System.out.println();
      postOrder(b);
    }
}
