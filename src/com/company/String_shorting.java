package com.company;
import java.util.Scanner;

public class String_shorting {
        public static void main(String[] args) {
            String s="the quick brown fox jumps not the lazy little cat";
            int length=s.length();
            String ar[]=s.split(" ");
            for(int x=0;x<ar.length;x++)
            {
                for(int y=0;y<ar.length-1-x;y++)
                {
                    if(ar[y].length()>ar[y+1].length())
                    {
                        String temp=ar[y];
                        ar[y]=ar[y+1];
                        ar[y+1]=temp;
                    }
                }
            }
            for(int x=0;x<ar.length;x++)
            {
                for(int y=0;y<ar.length-1-x;y++)
                {
                    if(ar[y].length()==ar[y+1].length() && ar[y].compareTo(ar[y+1])>0)
                    {
                        String temp=ar[y];
                        ar[y]=ar[y+1];
                        ar[y+1]=temp;
                    }
                }
            }
            for(String temp:ar)
                System.out.println(temp);
        }
    }

