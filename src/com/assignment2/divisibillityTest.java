package com.assignment2;

import java.util.Scanner;

public class divisibillityTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=sc.nextInt();
        if(num%3==0){System.out.printf("Consultadd ");}
        if (num%5==0){System.out.printf("JAVA Training");}
        else if (num%3==num%5){}
    }

}
