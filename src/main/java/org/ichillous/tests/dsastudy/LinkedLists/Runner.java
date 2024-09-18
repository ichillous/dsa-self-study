package org.ichillous.tests.dsastudy.LinkedLists;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.printList();

        myLinkedList.reverse();
        myLinkedList.printList();
    }

}
