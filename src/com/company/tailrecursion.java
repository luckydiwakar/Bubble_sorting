package com.company;

//==========================================PRINT NUMBER 5 TO 1==============================================

//public class tailrecursion {
//    public static void printnum(int n) {
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        printnum(n-1);
//    }
//    public static void main(String[] args) {
//        int n=5;
//        printnum(n);
//    }
//}

//==========================================PRINT NUMBER 5 TO 1 =================================================


public class tailrecursion {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int n[];
        n= arr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(n[i]);
        }
    }
}
