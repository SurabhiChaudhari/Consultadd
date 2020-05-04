package com.Assignment3;

import java.util.Scanner;

public class CalHelper {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int days=0;
    String month_name=" ";
    System.out.println("Please enter the month in a number");
    int month= sc.nextInt();
    int leap_yr_days=0;
       // System.out.println("Please enter the year in a number");
   // int year=sc.nextInt();
    switch(month) {
        case 1:
            month_name = "January";
            days = 31;
            break;

        case 2:
            month_name = "February";
          days= 28;
          leap_yr_days=29;
          System.out.println("Month February has "+leap_yr_days+" days if leap year or");
            break;

        case 3:
            month_name = "March";
            days = 31;
            break;
        case 4:
            month_name = "April";
            days = 30;
            break;
        case 5:
            month_name = "May";
            days = 31;
            break;
        case 6:
            month_name = "June";
            days = 30;
            break;
        case 7:
            month_name = "July";
            days = 31;
            break;
        case 8:
            month_name = "August";
            days = 31;
            break;
        case 9:
            month_name = "September";
            days = 30;
            break;
        case 10:
            month_name = "October";
            days = 31;
            break;
        case 11:
            month_name = "November";
            days = 30;
            break;
        case 12:
            month_name = "December";
            days = 31;
            break;

        default:
            System.out.println("Invalid Details");
    }

        System.out.printf("Month "+month_name+" has "+days+" days.");

    }

    }

