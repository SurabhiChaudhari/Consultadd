package com.assignment1;

import java.util.Scanner;

public class floating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        float myFloat = sc.nextFloat();
        if (myFloat % 1 != 0){
            System.out.println("Congratulations your value is a float:" +myFloat);
        }

    }
}
