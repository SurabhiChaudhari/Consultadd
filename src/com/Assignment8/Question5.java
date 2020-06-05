package com.Assignment8;

public class Question5 {
    public static void main(String[] args) {

        String[] testdata = {"OnceUpon", "a", "time.There lived a princess"};

        for (String input : testdata) {
            System.out.printf(
                    "Number of words in string '%s' is : %d %n", input,
                    countWordsUsingSplit(input));
        }
    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
}


