package com.Assignment3;

import java.util.Scanner;

public class avgNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg=0;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum= num+sum;
            avg=sum/10;

        }
        System.out.println("The average is: "+avg);
    }
}