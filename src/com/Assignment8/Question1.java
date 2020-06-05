package com.Assignment8;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Question1 {





        public static void main(String[] args) {

            System.out.println(reverse("Surabhi"));;
        }
        public static String reverse(String string) {
            return Stream.of(string)
                    .map(word->new StringBuilder(word).reverse())
                    .collect(Collectors.joining(" "));
        }
    }

