package com.company;

public class Inserting_sorting {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        }
    public static void main(String[] args) {
        int arr[] = {8,1,9,3,7,2,6,4,5};

        // inserting sorting
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0  && current  < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}
