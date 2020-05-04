package com.Assignment5;

public class ArrayQuestion2 {
    public static void main(String[] args) {

        int arr[] = { 10, 40, 50, 80, 90, 51, 41, 30, 60, 79 };
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);

    }
}
