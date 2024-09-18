package org.ichillous.tests.dsastudy.BST;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(1);
        bst.insert(20);
        bst.insert(8);
        System.out.println(bst.contains(21));

        System.out.println(bst.root.right.value);



    }
}
