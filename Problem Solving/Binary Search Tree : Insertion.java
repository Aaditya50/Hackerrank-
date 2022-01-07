import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
   
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if(root == null) return new Node(data);
        
        Node node = root;
        while(true){
            if(node.data >= data){
                if(node.left != null){
                    node = node.left;
                }else{
                    node.left = new Node(data);
                    break;
                }
            }else{
                if(node.right != null){
                    node = node.right;
                }else{
                    node.right = new Node(data);
                    break;
                }
            }
        }
        return root;
    	
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}
