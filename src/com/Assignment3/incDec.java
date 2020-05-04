package com.Assignment3;

import java.util.Scanner;

public class incDec {
    public static void main(String []args){
        System.out.println("Please enter the 3 numbers");
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c=sc.nextInt();

        if(c>b&b>a&c>a){System.out.println("Increasing");}
        else if(a>b& b>c& a>c){System.out.println("Decreasing");}
        else{System.out.println("Neither increasing nor decreasing.");}
    }

}
