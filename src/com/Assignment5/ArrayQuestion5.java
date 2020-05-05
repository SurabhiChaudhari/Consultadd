package com.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQuestion5 {
    public static void main(String[] args){
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        System.out.println("Original array: "+ Arrays.toString(arr));
        moveZerosToEnd(arr, n);
        System.out.println("Modified array: "+ Arrays.toString(arr));
    }

    static void moveZerosToEnd(int arr[], int n) {

        // Count of non-zero elements
        int count = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            if ((arr[i] != 0)) {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count = count + 1;
            }
        }
    }


}
