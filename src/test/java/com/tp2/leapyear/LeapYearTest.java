package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static com.tp2.leapyear.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    // TODO: Replace these lines with your tests
    @Test
    void exampleTest(){
        assertEquals(true, isLeapYear(2024));
        assertEquals(false, isLeapYear(600));
        assertEquals(true, isLeapYear(400));
    }

//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
