//package com.company;
//import java.util.LinkedList;
//public class LL {
//    class Node {
//        String Node;
//        Node next;
//        Node(String data){
//            this.Node=data;
//            this.next=null;
//        }
//        public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.addFirst("luckky");
//        list.addLast("diwakar");
//        list.addFirst("aa");
//        list.addFirst("luckky");
//        list.addLast("diwakar");
//        list.addFirst("aa");
//        list.addFirst("luckky");
//        list.addLast("diwakar");
//        list.addFirst("");
//        list.removeFirst();
//        list.removeLast();
//        list.remove(3);
//        list.remove(2);
//        System.out.println(list);
//        list.removeFirst();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
//        }
//        }
//          }
//// =================================================================================================================================================================================
//////    public Node reverseListRecursive(Node head) {
//////        //empty node || last node or only one node
//////        if(head == null || head.next == null) {
//////            return head;
//////        }
//////        Node newHead = reverseListRecursive(head.next);
//////        head.next.next = head;
//////        head.next = null;
//////        return newHead;
//////    }
//////   }
//////    public static void main(String[] args) {
//////        LL list = new LL();
//////        System.out.println();
//////    }
//// }
//
