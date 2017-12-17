package algorithm.ergodic;

import java.util.Stack;

public class TreeDFS {

    public static void instack(Stack<Node> stack, Node root){
        if(root != null){
            if(root.rightNode!=null){
                instack(stack,root.rightNode);
            }
            stack.add(root);
            if(root.leftNode != null){
                instack(stack,root.leftNode);
            }
        }

    }

    public static void DFS(){
        Stack<Node> stack = new Stack<Node>();
        Node root = Node.getTree();
        instack(stack,root);
        while(!stack.empty()){
            System.out.println(stack.pop().number);
        }
    }

}
