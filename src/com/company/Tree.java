package com.company;
public class Tree {
        int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        }
    public static void print(  Tree root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
       Tree root= new Tree(8);
        Tree rleft= new Tree(4);
        Tree rleft1 = new Tree(3);
        Tree rright= new Tree(6);
        Tree rright1 = new Tree(5);
        root.left = rleft;
        root.left.left=rleft1;
        root.right.right = rright1;
        print(root);
    }
}
