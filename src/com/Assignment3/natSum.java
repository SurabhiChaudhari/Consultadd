package com.Assignment3;

import java.util.Scanner;

public class natSum {
    public static void main(String args[]) {

        int num, i, total = 0;
        System.out.println("Enter the value of natural number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(i = 1; i <= num; i++){
            total = total + i;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
    }
}
