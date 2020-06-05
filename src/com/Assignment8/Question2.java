package com.Assignment8;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        Map<Character, Long> collect =  "papaya".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
    }
}
