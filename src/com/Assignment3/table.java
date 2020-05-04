package com.Assignment3;
import java.util.*;
public class table {
    public static void main(String args[])
    {
        System.out.println("Please enter a number");
        Scanner sc =  new Scanner(System.in);
        int mul = sc.nextInt();

        for(int i=0;i<11;i++){
           int prod= mul*i;
           System.out.println(mul+"*"+i+"="+prod);
        }




    }}
