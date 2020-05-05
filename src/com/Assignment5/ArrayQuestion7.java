package com.Assignment5;

import java.util.Arrays;

public class ArrayQuestion7 {
    public static void main(String args[]){
        int [] my_array= {10,40,80,20};
        System.out.println("Original Array: "+ Arrays.toString(my_array));
        int max =my_array[0];
        int min =my_array[0];
        for(int i=0;i<my_array.length;i++){
            if(my_array[i]> max){
                max=my_array[i];
            }
            else if(my_array[i]<min){
                min=my_array[i];
            }
        }
 int difference= max-min;
        System.out.println("The difference between maximum & minimum value of an array is:" + difference);




    }
}
