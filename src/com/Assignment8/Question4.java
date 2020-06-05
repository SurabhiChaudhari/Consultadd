package com.Assignment8;

import java.util.Collections;
import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        GfG obj = new GfG();
        String input = "Surabhi";

        if (obj.uniqueCharacters(input))
            System.out.println( input + " is unique ");
        else
            System.out.println( input + " is not unique");
    }

    static class GfG {
        boolean uniqueCharacters(String s) {
            // If at any character more than once create another stream
            // stream count more than 0, return false
            return s.chars().filter(e -> Collections.frequency(s.chars().boxed().collect(Collectors.toList()), e) > 1).count() > 1 ? false : true;
        }
    }
}
