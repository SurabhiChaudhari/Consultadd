package com.assignment;

import java.util.Scanner;

public class divisibilityTest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
       int num=sc.nextInt();
     int  a=num % 3;
      int b=num % 5;
        if (a == b){
            System.out.println("Congratulations your value is divisible by 3 and 5");
        }
    else{
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
