package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeIterator implements Iterator<BinaryTree> {
    Queue<BinaryTree> treeQueue = new LinkedList<>();
//    Queue<Integer> levelQueue = new LinkedList<>();

    public BinaryTreeIterator(BinaryTree binaryTree){
        treeQueue.add(binaryTree);
//        levelQueue.add(0);
    }

    @Override
    public boolean hasNext() {
        return !treeQueue.isEmpty();
    }

    @Override
    public BinaryTree next() {
        BinaryTree first = treeQueue.remove();
//        Integer firstLevel = levelQueue.remove();
        if (first.lchild != null){
            treeQueue.add(first.lchild);
//            levelQueue.add(firstLevel + 1);
        }
        if (first.rchild != null){
            treeQueue.add(first.rchild);
//            levelQueue.add(firstLevel + 1);
        }
        return first;
    }
}
