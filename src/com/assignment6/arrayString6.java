package com.assignment6;

public class arrayString6 {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer("heLLo WOrLd");

        System.out.println(str);

        int ln = str.length();

        // Conversion using predefined methods
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1, Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1, Character.toLowerCase(c) + "");
        }
        System.out.println(str);
    }
}
