package com.assignment2;

public class average {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        int avg = (a + b + c) / 3;
        System.out.println(avg);
        if (avg > a & avg > b & avg > c) {
            System.out.println("Average is higher than a,b,c");
        } else {
            if (avg > a & avg > b) {
                System.out.println("Average is higher than a,b");
            }
           else if (avg > a & avg > c) {
                System.out.println("Average is higher than a,c");
            }
           else if (avg > a & avg > c) {
                System.out.println("Average is higher than a,c");
            }
            else{
                if(avg>a){
                    System.out.println("Average is higher than a");
                }
                else if(avg>b){
                    System.out.println("Average is higher than b");
                }
                else{
                    System.out.println("Average is higher than c");
                }

            }

        }

    }
}
