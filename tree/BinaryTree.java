package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class MyBinaryTree {
        static int index = -1;

        public  Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1)
                return null;
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public  void preOrder(Node root){
            if(root==null)return;
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
        }

        public  void inOrder(Node root){
            if(root==null)return;
            inOrder(root.left);
            System.out.print(root.data+"->");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root==null)return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");
        }

        public void levelOrder(Node root){
            if(root==null)return;
           Queue<Node>q=new LinkedList<>();
           q.add(root);
           q.add(null);
           while (!q.isEmpty()) {
            Node currentNode=q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data+"->");
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
           }
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        MyBinaryTree mb=new MyBinaryTree();
        Node root=mb.buildTree(nodes);
        System.out.println(root.data);
        // mb.preOrder(root);
        // mb.inOrder(root);
        // mb.postOrder(root);
        mb.levelOrder(root);
    }
}
