package com.company;


public class Selection_sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,1,2,8,3,5,6,4,5};
        //selection sort
        for (int i = 0; i <arr.length-1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
             arr[i] = temp;
        }
        printArray(arr);
    }
}









