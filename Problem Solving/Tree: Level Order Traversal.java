	public static void levelOrder(Node root) {
      if(root == null) return;
      
      LinkedList<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          Node node = q.remove();
          System.out.print(node.data+" ");
          if(node.left != null) q.add(node.left);
          if(node.right != null) q.add(node.right);
      }
       
    }
