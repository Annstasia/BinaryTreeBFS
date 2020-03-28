package com.company;

public class BinaryTree {

    int value;
    int level;
    BinaryTree lchild;
    BinaryTree rchild;

    public BinaryTree(int value, int level) {
        this.value = value;
        this.level = level;
        this.lchild = null;
        this.rchild = null;
    }

    public BinaryTree(int value) {
        this.value = value;
        this.level = 0;
        this.lchild = null;
        this.rchild = null;
    }

    public BinaryTree insertNode(BinaryTree node, int targetValue) {
//        if (node == null) {
//            node = new BinaryTree(targetValue, );
//            return node;
//        }
        if (node.value > targetValue) {
            if (node.lchild == null)
                return node.lchild = new BinaryTree(targetValue, node.level + 1);
            else
                return insertNode(node.lchild, targetValue);
        }
        else if (node.value < targetValue) {
            if (node.rchild == null)
                return node.rchild = new BinaryTree(targetValue, node.level + 1);
            else
                return insertNode(node.rchild, targetValue);
        }
        return null;
    }

    public void printBinaryTree(BinaryTree node, int level) {
        if (node != null) {
            printBinaryTree(node.lchild, level + 1);
            for (int i = 0; i < level; i++)
                System.out.print("   ");
            System.out.println(node.value);
            printBinaryTree(node.rchild, level + 1);
        }
    }
}