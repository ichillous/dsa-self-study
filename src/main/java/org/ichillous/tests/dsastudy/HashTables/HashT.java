package org.ichillous.tests.dsastudy.HashTables;

import java.util.ArrayList;
import java.util.Arrays;

public class HashT {
    private int size = 7;
    private Node[] dataMap;

    public class Node {
        public String key;
        public int value;
        public Node next;
        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public HashT() {
        dataMap = new Node[size];
    }

    public void print() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode; // this points it to new nodes
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key.equals(key)) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                list.add(temp.key);
                temp = temp.next;
            }
        }
        return list;
    }
}
