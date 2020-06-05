package com.Assignment8;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(Question6(153));

    }
    public static boolean Question6(int input) {
        char[] digits = Integer.toString(input).toCharArray();
        int exp = digits.length;
        int result = 0;
        for(char digit: digits) {
            int number = Character.getNumericValue(digit);
            number = (int) Math.pow(number, exp);
            result += number;

        }
        System.out.println(result);
        return result == input;

    }


}
