package com.assignment6;

import java.util.Scanner;

public class arrayString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        spaceRemoval(sc.nextLine());
    }

    private static void spaceRemoval(String myString) {
        myString= myString.replaceAll(" ", "");
        System.out.println(myString);
    }


    }

