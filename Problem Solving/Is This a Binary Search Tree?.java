    boolean checkBST(Node root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }



    boolean isBST(Node root,int min , int max){
        if(root == null) return true;
        if(root.data>= max || root.data<=min) return false;
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
    }
