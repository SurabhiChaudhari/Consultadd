package com.Assignment4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args)

    {
        int i,j;
        System.out.print("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
