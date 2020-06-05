package com.Assignment8;

import java.util.Arrays;

public class Question9 {

    static int largest(int []arr, int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }

    static public void main (String[] args)
    {
        int []arr = {10, 324, 45,
                90, 9808};
        int n = arr.length;
        System.out.println(largest(arr, n));
    }
}

