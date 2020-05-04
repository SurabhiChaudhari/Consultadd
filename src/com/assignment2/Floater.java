package com.assignment2;

import java.util.Scanner;

public class Floater {
    public static void main(String args[]) {
        System.out.println("Please enter any floating number");
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        if (aDouble > 0) {
            if (aDouble < 1) {
                System.out.println("Positive small");
            } else if (aDouble > 1000000) {
                System.out.println("Positive Large");
            } else {
                System.out.println("Positive");
            }
        } else if (aDouble < 0) {
            if (Math.abs(aDouble) < 1) {
                System.out.println("Negative small");
            } else if (Math.abs(aDouble) > 1000000) {
                System.out.println("Negative Large");
            } else {
                System.out.println("Negative");
            }

        } else {
            System.out.println("zero");
        }


    }
}

