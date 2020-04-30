package com.assignment;

import java.util.Scanner;

public class stringformating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int i1= sc.nextInt();
        int i2 = sc.nextInt();
        int i3 =  sc.nextInt();

        System.out.println("");
        System.out.println("=====================================");
        System.out.printf("%-15s %02d %n",s1,i1);
        System.out.printf("%-15s %03d %n",s2,i2);
        System.out.printf("%-15s %03d %n",s3,i3);
        System.out.println("=====================================");
        System.out.println("");

    }
}
