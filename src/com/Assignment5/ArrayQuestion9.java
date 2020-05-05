package com.Assignment5;

public class ArrayQuestion9 {
    public static void main(String args[])
    {
        int[] arr = {1,2,4,5,6};
        int sum = 6;
        getPairsCount(arr, sum);
    }

    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {

        int count = 0;// Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum){
                    count++;
                System.out.println(arr[i]+ " + "+arr[j]+" = "+sum);
                }

            }
        System.out.printf("No. of pairs is %d", count);
    }
}

