package algorithm.ergodic;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {

    public static void BFS(){
        Node root = Node.getTree();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.number);
            if(temp.leftNode != null){
                queue.add(temp.leftNode);
            }
            if(temp.rightNode != null){
                queue.add(temp.rightNode);
            }
        }
    }

}
