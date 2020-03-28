package problem2.main;

import problem1.mybst.MyBinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(35);
        tree.insert(11);
        tree.insert(20);
        tree.insert(34);
        tree.insert(40);

        System.out.println("pre Order Traversal");
        tree.preOrderTraversal();

        System.out.println("\n\npost Order Traversal");
        tree.postOrderTraversal();

    }
}