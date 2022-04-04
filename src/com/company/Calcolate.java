package com.company;

public class Calcolate {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = arr[1] + arr[0];
        arr[3] = arr[2] - arr[1];
        arr[4] = arr[3];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("num"+"["+i+"]"+  "  "+arr[i]);
        }
    }
}



