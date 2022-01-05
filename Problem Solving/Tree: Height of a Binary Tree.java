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

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
  
  
  //ANSWER STARTS
	public static int height(Node root) {
      	// Write your code here.
        int lh = 0, rh = 0;
        if(root.left != null){
            lh = 1 + height(root.left);
        }
        if(root.right != null){
            rh = 1 + height(root.right);
        }
        
        return lh > rh ? lh : rh;
    }
//ANSWER ENDS
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
        int height = height(root);
        System.out.println(height);
    }	
}



/*
Input (stdin)
7
3 5 2 1 4 6 7

Expected Output
3
*/
