package com.assignment6;

public class arrayString2 {
    public static void main(String[] args) {


        int arr[] = {10, 40, 50, 80, 90, 51, 41, 30, 60, 79};
        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;

        System.out.println("The given array is:");
        for (
                int i = 0;
                i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            sum+=arr[i];
        }
        for (
                int i = 0;
                i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];


            }
            if(arr[i] < smallest) {
                smallest = arr[i];

            }
            }
        sum=sum-largest;
        sum=sum-smallest;
        System.out.println("the largest is "+largest);
        System.out.println("the smallest is "+smallest);
        System.out.println("sum is"+sum);
        }



    }


