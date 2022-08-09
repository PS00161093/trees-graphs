class PostOrderByIteration {
  
  public static void postOrder(Node root) {
        
        //PostOreder = Right -> Left -> Root
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            list.add(0, curr.data);
            
            if(curr.left != null) {
                stack.push(curr.left);
            }
            
            if(curr.right != null) {
                stack.push(curr.right);
            }
        }
        
        for(int n: list) System.out.print(n + " ");
    }
}
