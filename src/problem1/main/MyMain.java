package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

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

        tree.ourTraversal();
    }
}