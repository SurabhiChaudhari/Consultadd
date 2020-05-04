package com.Assignment3;
import java.util.*;
public class longNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        sc.close();
        long length = 0;
        long sum = 0;
        while (l1 > 0& l1!=0) {
            sum = sum + (l1 % 10);
            l1 = l1 / 10;
            // System.out.println(l1);
            length = length + 1; }
            System.out.println("length: "+length+" Sum: "+sum);

            }
           //



        }
