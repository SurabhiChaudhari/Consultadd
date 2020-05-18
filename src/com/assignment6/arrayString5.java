package com.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayString5 {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(23,25,75,87,47,1,91,51,2));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(22,44,64,76,98,12,43,54,90));
        System.out.println("Removed from Odd Numbers:");
        for(int i=0;i<a.size();i++){
            if(a.get(i) %2==0){
                System.out.println(a.get(i));

            }
        }
        System.out.println("Removed from Even Numbers:");
        for(int j=0;j<a.size();j++){
            if(b.get(j) %2!=0){
                System.out.println( b.get(j));
            }
        }
    }
}
