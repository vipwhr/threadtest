package algorithm.ergodic;

public class Node {

    public Node leftNode;
    public Node rightNode;
    public int number;

    public Node(int number){
        this.number = number;
    }

    public static Node getTree(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        node1.leftNode = node2;
        node1.rightNode = node3;

        node2.leftNode = node4;
        node2.rightNode = node5;

        node3.leftNode = node6;
        node3.rightNode = node7;

        node4.leftNode = node8;
        node4.rightNode = node9;

        node5.leftNode = node10;
        node5.rightNode = node11;

        node6.leftNode = node12;
        return node1;
    }

}
