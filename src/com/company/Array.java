//package com.company;
//
//import java.util.Stack;
//public class Array {
//    public class stackclass {
//        public static void main(String[] args) {
//            Stack<Integer> s = new Stack<>();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//            s.push(4);
//            s.push(5);
//            while(!s.isEmpty()) {
//                System.out.println(s.peek());
//                s.pop();
//            }
//        }
//    }
//}
//

import com.sun.source.tree.WhileLoopTree;

import java.util.Stack;

public  class Array {
        public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while (!s.isEmpty()){
                System.out.print(s.peek());
                s.pop();

            }

        }
}