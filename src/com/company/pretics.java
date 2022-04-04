package com.company;

import java.sql.SQLOutput;

public class pretics {
    public static void printnum(int n){
        if(n == 33){
            return;
        }
        System.out.println(n);
        printnum(n+3);
    }
    public static void main(String[] args) {
        int n=3 ;
        printnum(n);
    }
}
