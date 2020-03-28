package problem4.myqueue;
// to create queue to store pre - order successor
import com.sun.source.tree.Tree;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.element.Element;

import java.util.LinkedList;
import java.util.List;

public class MyQueue<T> {
    private Element front;
    private Element back;
    private MyBinarySearchTree tree;

    public MyQueue(MyBinarySearchTree tree){
        this.tree = tree;
    }

    public <T>void add(Element ele){
        if(isEmpty()){
            front = ele;
            back = ele;
        }
        else {
            back.setNext(ele);
            back = ele;
        }
    }

    public void addAllPreOrderSuccessor(){
        TreeNode current = tree.getRoot();
        List l = new LinkedList();
        l.add(current);
        while (!l.isEmpty()){
            try{
                TreeNode remove = (TreeNode)l.remove(0);
                if(remove != null){
                    TreeNode preOrder = tree.preOrderSuccessor(remove.getData());
                    Element ele = new Element(remove,preOrder);
                    this.add(ele);
                }
                l.add(remove.getLeftChild());
                l.add(remove.getRightChild());
            }
            catch (Exception e){}
        }
    }

    public void printQueue(){
        Element current = front;
        System.out.println("\n     Nodes      "+"  preOrderSuccessor");
        while (current != null){
            System.out.println(current.getNode() +"  ->  "+current.getPreOrderSuccessor());
            current = current.getNext();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }
}