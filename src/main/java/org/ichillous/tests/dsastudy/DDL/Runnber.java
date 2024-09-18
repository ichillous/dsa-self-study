package org.ichillous.tests.dsastudy.DDL;

public class Runnber {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);

        myDLL.append(1);
        myDLL.append(2);

        myDLL.printList();
        myDLL.remove(1);
        myDLL.printList();
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        myDLL.printList("" + myDLL);
//        myDLL.printList("" + myDLL);
    }
}
