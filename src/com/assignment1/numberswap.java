package com.assignment1;
//Swap two numbers using third variable as result name and do the same task without using any third variable.
public class numberswap {
    public static void main (String args[]){
       int firstNum =10;
       int secondNum=20;
       int resultName=0;

       resultName=firstNum; //result =10
        firstNum=secondNum; //firstNum =20
       secondNum=resultName;
       System.out.println("The value of first number is:" + firstNum + " "+"second number is: "+ secondNum+" "+ "result is:"+ resultName);

    }
}
