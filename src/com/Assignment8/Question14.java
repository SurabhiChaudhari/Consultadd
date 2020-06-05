package com.Assignment8;

import java.util.Arrays;
import java.util.List;

public class Question14 {
    public static void main(final String[] args) {
        List<String> friends = Arrays.asList("Ross", "Chandler",
                "Monica", "Joey", "Rachel");

        friends.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

    }
}
