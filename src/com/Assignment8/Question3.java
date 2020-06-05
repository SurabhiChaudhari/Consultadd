package com.Assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Question3 {
    public static void main(String[] args) {
        Collection listOne = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Collection listTwo = new ArrayList(Arrays.asList(3,5,7,9));

        listOne.retainAll( listTwo );
        System.out.println( listOne );
    }
}
