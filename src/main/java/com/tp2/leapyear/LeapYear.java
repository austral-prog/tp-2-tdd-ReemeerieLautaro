package com.tp2.leapyear;


public class LeapYear {

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        return true;
        }
        else{
            return false;
        }
    }

    }


