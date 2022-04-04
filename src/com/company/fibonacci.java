//package com.company;
////
////public class fibonacci {
////    public static void printfib(int a, int b, int n) {
////        if (n == 0) {
////            return;
////        }
////        int c = a + b;
////        System.out.println(c);
////        printfib(b, c, n - 1);
////    }
////
////    public static void main(String[] args) {
////        int a = 0, b = 1;
////        System.out.println(a);
////        System.out.println(b);
////        int n = 9;
////        printfib(a, b, n - 2);
////    }
////}
//
//
//class SubarraySum {
//    int subArraySum(int arr[], int n, int sum)
//    {
//        int curr_sum, i, j;
//        for (i = 0; i < n; i++) {
//            curr_sum = arr[i];
//            for (j = i + 1; j <= n; j++) {
//                if (curr_sum == sum) {
//                    int p = j - 1;
//                    System.out.println("Sum found between indexes " + i + " and " + p);
//                    return 1;
//                }
//                if (curr_sum > sum || j == n)
//                    break;
//                curr_sum = curr_sum + arr[j];
//            }
//        }
//
//        System.out.println("No subarray found");
//        return 0;
//    }
//
//    public static void main(String[] args)
//    {
//        SubarraySum arraysum = new SubarraySum();
//        int arr[] = { 1,2,3,5,6,7,8,9,10};
//        int n = arr.length;
//        int sum = 15;
//        arraysum.subArraySum(arr, n, sum);
//    }
// Java implementation
public class fibonacci
{
    static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        System.out.println(getMissingNo(arr, arr.length));
    }
}