package com.assignment2;

import java.util.Scanner;

public class random {
    public static void main(String args[]) {
        System.out.println("Please enter a character");
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        String random = new String("random");
        if (Character.isLetter(c1)) {
            if (random.contains(Character.toString(c1))) {
                System.out.println("char found");}
            else if (random.toUpperCase().contains(Character.toString(c1))){
                System.out.println("char found");
            }

                else{
                    System.out.println("Char not found");
                }



        }
    }
}
