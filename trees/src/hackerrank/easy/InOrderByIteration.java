class InOrderByIteration {
  
      public static void inOrder(Node root) {
        
        //InOrder - Left -> Root -> Right
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node c = root;
        
        while(!stack.isEmpty() || c != null) {
            while(c != null) {
                stack.push(c);
                c = c.left;
            }
            c = stack.pop();
            list.add(c.data);
            c = c.right;
        }

        for(int n: list) System.out.print(n + " ");
    }
}
