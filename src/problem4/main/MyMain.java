package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree t = new MyBinarySearchTree();
        t.insert(10);
        t.insert(20);
        t.insert(3);
        t.insert(30);
        t.insert(15);

        System.out.println("PreOrder Traversal");
        t.preOrderTraversal();

        MyQueue<TreeNode> q = new MyQueue(t);

        q.addAllPreOrderSuccessor();

        q.printQueue();
    }
}