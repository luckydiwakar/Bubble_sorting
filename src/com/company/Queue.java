//package com.company;
////
////public class Queue {
////    class statc Queue{
////        static int arr[];
////        static int size;
////        static int rear =-1;
////
////
////        Queue (int n){
////            arr = new int[n];
////            this.size =n;
////        }
////        public static boolean isempty(){
////            return rear == -1;
////        }
////        //enqueue
////        public static void add(int data){
////
////            if(rear==size-1){
////                System.out.println("full queue");
////                return;
////            }
////            rear++;
////            arr[rear] = data;
////        }
////        //dequeue
////        public static int remove(){
////            if(isempty()){
////                System.out.println("empty queue");
////                return -1;
////
////            }
////            int front = arr[0]
////                    for(int i=0; i<rear; i++){
////                        arr[i] = arr[i+1];
////                    }
////                    return --;
////                    return front;
////
////        }
////        //peek
////        public  static int peek{
////            if(isempty()){
////                System.out.println("empty queue");
////                return-1;
////
////            }
////            return arr[0];
////
////        }
////
////        public static void main(String[] args) {
////            Queue q = new Queue();
////            q.add(1);
////            q.add(2);
////            q.add(3);
////
////            while
////
////        }
////    }
//
//
//public class Queue {
//
//        static int arr[];
//        static int size;
//        static int rear = -1;
//
//        Queue(int n){
//            arr = new int [n];
//            this.size =n;
//
//        }
//        public static boolean isEmpty(){
//            return  rear ==-1;
//        }
//        // enqueue
//    public static void add(int data){
//            if (rear == size-1){
//                System.out.println("this queue is empty");
//                return;
//        }
//        rear ++;
//    arr[rear] = data;
//    }
//
//    // dequeue
//    public static void remove(){
//            if(isEmpty()){
//                System.out.println("empty queue");
//                return ;
//            }
//            int front = arr[0];
//        for (int i = 0; i <rear ; i++) {
//            arr[i] = arr[i+1];
//
//        }
//      //  return--1;
//        //return front;
//    }
//    //peek
//    public static int peek(){
//            if(isEmpty()){
//                System.out.println("empty queue");
//      //          return --1;
//            }
//            return  arr[0];
//    }
//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()) ;
//        {
//            System.out.println(q.peek());
//    //        return q;
//        }
//    }
//}