package com.company;
import java.util.Scanner;
public class Arraydelete {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        int location = 3;
        int max = 5;
        for(int i=location; i<max-1; i++){
            arr[i] =arr[i+1];
        }
        max--;
        for (int i=0; i<max; i++){
            System.out.println(arr[i]);
        }
    }
}
