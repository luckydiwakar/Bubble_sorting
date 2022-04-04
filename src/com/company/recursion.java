package com.company;
//======================================PRINT SUM OF FRIST N NATURAL NUMBER======================================
public class recursion {
    public static void main(String[] args) {
        recursion r=new recursion();
        int a= r.sum(10);
        System.out.println(a);
    }
    int sum(int n){

        if (n>0){
            return n+sum(n-1);
        }
        else{
            return 0;
        }
    }
}
//=============================================SECOND METHOD ===================================================
//public class recursion {
//    public static void printsum(int n, int i, int sum) {
//        if (i == n) {
//            sum = 1;
//            System.out.println(sum);
//            return;
//        }
//        sum = i;
//        printsum(i-1 , n, sum);
//    }
//    public static void main(String[] args) {
//        printsum(1 ,5,0);
//    }
//}