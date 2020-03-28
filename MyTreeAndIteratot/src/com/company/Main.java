package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] b = {1, 2, 3, 0, 87, 5, -1, 23, 56};
	    BinaryTree binaryTree = new BinaryTree(b[0]);
	    for (int i = 1; i < b.length; i++){
	        binaryTree.insertNode(binaryTree, b[i]);
        }

	    BinaryTreeIterator binaryTreeIterator = new BinaryTreeIterator(binaryTree);
	    while (binaryTreeIterator.hasNext()){
	    	BinaryTree tree =  binaryTreeIterator.next();
	        System.out.println("Value: " + tree.value + " Level: " + tree.level);
        }
    }
}
