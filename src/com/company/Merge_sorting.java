//package com.company;
//
//public class Merge_sorting {
//    public static void conquer(int arr[],int sit, int mid,int end ){
//        int[] merged = new int [end - sit+1];
//        int index1 = sit;
//        int index2 = mid +1;
//        int x  = 0;
//        while(index1<= mid && index2 <=end){
//            if (arr[index1] <= arr[index2]){
//                merged[x++] = arr [index1++];
//            }
//            else{
//                merged[x++] = arr[index2++];
//            }
//        }
//            while (index1 <= mid){
//                merged[x++] = arr[index1++];
//            }
//            while (index2 <= end ){
//                merged[x++] = arr[index2++];
//
//            }
//        for (int i = 0, j=sit; i <merged.length; i++,j++) {
//            arr[j] = merged[i];
//
//        }
//    }
//    public static void divide(int arr[], int sit ,int end,int mid ){
//        if(sit >= end ){
//            return;
//        }
//        mid = sit+(end -sit)/2;
//        divide (arr,sit,end);
//        divide(arr,mid,end);
//        conquer(arr,sit,end,mid);
//    }
//    public static void main(String[] args) {
//        int arr[] = {9,8,7,1,2,3,4,5,6};
//        int n = arr.length;
//        divide(arr,0,n-1);
//        for (int i=0; i<n;i++) {
//            System.out.print(arr[i]+"");
//        }
//
//        System.out.println();
//    }
//    }
//
