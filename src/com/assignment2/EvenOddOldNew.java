package com.assignment2;

import java.util.Scanner;

public class EvenOddOldNew {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int myNum=sc.nextInt();
        if (myNum%2!=0){
            System.out.println("NEW");
        }
        else if(myNum%2==0&myNum>=2&myNum<=5){
            System.out.println("OLD");
        }
        else if(myNum%2==0&myNum>=6&myNum<=30){
            System.out.println("NEW");
        }
        else if(myNum%2==0&myNum>30){
            System.out.println("OLD");
        }
    }
}
