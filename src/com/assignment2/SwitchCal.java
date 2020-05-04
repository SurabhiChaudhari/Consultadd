package com.assignment2;

import java.util.Scanner;

public class SwitchCal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operation number between 1 to 5");
        int operation=sc.nextInt();
        System.out.println("Please enter first number");
        int first=sc.nextInt();
        System.out.println("Please enter second number");
        int second=sc.nextInt();
        int z=0;
        switch(operation) {
            case 1:
                z = first + second;
                System.out.println("The sum is: " + z);
                break;
            case 2:
                z = first - second;
                System.out.println("The subtraction is: " + z);
                break;
            case 3:
                z = first / second;
                System.out.println("The division is: " + z);
                break;
            case 4:
                z = first * second;
                System.out.println("The multiplication is: " + z);
                break;
            case 5:
                System.out.println("Please enter first1 number");
                int first1 = sc.nextInt();
                System.out.println("Please enter second2 number");
                int second2 = sc.nextInt();
                z = (first + second + first1 + second2) / 4;
                System.out.println("The average is: " + z);
                break;
        }
                if (z<0){
                System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");}



        }




    }

