package com.assignment;

import java.util.Scanner;

public class add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first input from 1 to 10");
        int userInput1 = sc.nextInt();
        System.out.println("Please enter second input from 1 to 10");
        int userInput2 = sc.nextInt();
      int z=userInput1+userInput2;
      z+=30;
        System.out.println("The addition is: " +z);



    }
}
