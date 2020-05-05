package com.Assignment5;

import java.util.Arrays;

public class ArrayQuestion6 {
    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
        int j = 0;


        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];

        return j;
    }


    public static void main(String[] args) {
        int arr[] = {2,2,3,3,4,4,4,11,11,11,11};
        Arrays.sort(arr);
        int n = arr.length;
    int []  b = new int [n];
        n = removeDuplicates(arr, n);
        for (int i=0; i<n; i++) {
            for (int e = 0; e < n; e++) {
                b[e] = arr[i++];
            }
        }
        System.out.println(Arrays.toString(b));


    }
}



