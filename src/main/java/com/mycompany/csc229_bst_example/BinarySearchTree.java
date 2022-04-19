package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;
    private int HeightCount;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {
        if (root == null) {
            return;
        }
        doInOrder(root.getLeft());
        System.out.println(root.getData());
        doInOrder(root.getRight());
        // ToDo 1: complete InOrder Traversal 
    }
    
    private void doPreOrder(BstNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
        // ToDo 2: complete the pre-order travesal . 
    }
    
    public void preOrderTraversal() {
        doPreOrder(this.root); 
    }

    public Integer findHeight() {
        
        return doFindHeight(this.root);
        // ToDo 3: Find the height of a tree
    }
    
    private Integer doFindHeight(BstNode root){
        
        if(root == null)
            return -1;
        return Math.max(
                doFindHeight(root.getLeft())    ,
                doFindHeight(root.getRight())   ) +1;
    }
    
    

    public int getDepth(BstNode node) {
        
        if(root == null)
            return -1;
        
        int Depth = -1;
        
        
        
        return Depth;
    }
 
   /*public void print() {
       System.out.println("\n==== BST Print ===== \n");
        print("", root, false);
        // ToDo 5: complete the print of the BST
    }*/


}
