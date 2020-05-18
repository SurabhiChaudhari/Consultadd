package com.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class arrayString4 {

    static boolean is_isogram(String str) {
        // Convert the string in lower case letters
        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }



        // driver program
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
             String str1 = str;
            System.out.println(is_isogram(str));


        }


}
