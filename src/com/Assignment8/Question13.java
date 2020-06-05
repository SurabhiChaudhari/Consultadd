package com.Assignment8;

import java.util.Arrays;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        primes.stream() //
                .mapToInt(i -> i) //
                .average() //
                .ifPresent(avg -> System.out.println("Average found is " + avg));

// AVERAGE -- Solution 2
        int sum = 0;
        for (int i : primes) {
            sum += i;
        }
        if (primes.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Average found is " + sum / (float) primes.size());
        }
    }
}