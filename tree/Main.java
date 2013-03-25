package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: grisha_angelov
 */
public class Main {
    public static void main(String[] args) {

        Node root = new Node(5,
                new Node(3,                            // RIGHT CHILD
                        new Node(2, null, null),
                        new Node(4, null, null)),
                new Node(8,                            // LEFT CHILD
                        new Node(12, null, null),
                        new Node(20, null, null))
        );

        printBFS(root);
        printDFS(root);
    }

    public static void printBFS(Node root) {
        System.out.println("------ BFS ------");
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node n;
        while (!queue.isEmpty()) {
            n = queue.remove();

            if (n != null) {
                if (n.getLeftChild() != null) {
                    queue.add(n.getLeftChild());
                }


                if (n.getRightChild() != null) {
                    queue.add(n.getRightChild());
                }
            }
            System.out.println(n.getValue());
        }
    }
    public static void printDFS(Node root){
        System.out.println("------ DFS ------");
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        Node n;
        while (!stack.empty()){
            n = stack.pop();
            
            if(n!=null){
                
                if(n.getLeftChild()!=null){
                   stack.push(n.getLeftChild()); 
                }
                
                if(n.getRightChild()!=null){
                    stack.push(n.getRightChild());
                }
            }
            System.out.println(n.getValue());
        }
    }
}
