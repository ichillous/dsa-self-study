package org.ichillous.tests.dsastudy.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.print();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "B");

        graph.print();
        graph.removeVertex("D");
        graph.print();
    }
//    public int reverse(int x) {
//        List<String> list = new ArrayList<String>();
//        String srt = String.valueOf(x);
//
//        for (int i = 0; i < srt.length(); i++) {
//            list.add(srt.charAt(i) + "");
//        }
//        list.reversed();
//        String result ="";
//        for (int i = list.size() -1; i >= 1; i--) {
//            result += list.get(i);
//        }
//        int rev = Integer.parseInt(result);
//        int temp = 0;
//        if(x < 0 ){
//            rev = -rev;
//            temp = -rev;
//        }
//        return temp;
//    }
//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode prev;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next, ListNode prev) {
//          this.val = val; this.next = next; this.prev = prev;
//      }
//  }
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode slow = head.next;
//        ListNode fast = head.next.next;
//        ListNode prev = head;
//        ListNode target = new ListNode(k);
//        while (slow != null) {
//            slow = slow.next;
//            if (fast != null) {
//                fast = fast.next.next;
//            }
//        }
//        return prev;
//    }


}
