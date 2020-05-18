package com.assignment6;

import java.util.Scanner;

public class arrayString1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String s = scan.nextLine();

       // System.out.println(s);

        String[] words = s.split(" ");
        String smallestWord= " ";
System.out.println(words.length);
for(int i=0; i<words.length;i++){
if (i<=smallestWord.length())
{
    smallestWord=words[i];
}

}

System.out.println(smallestWord);
}
        }


