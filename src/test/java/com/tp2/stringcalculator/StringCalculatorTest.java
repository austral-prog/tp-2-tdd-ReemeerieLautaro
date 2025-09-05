package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();


    @Test
    void exampleTest(){
        assertEquals( 0, calculator.add(" "));
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(4, calculator.add("1,2,1"));
        assertEquals(6, calculator.add("1\n2,3"));
        assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2"));

    }

//    Missing tests:
//
//- Empty string should return 0
//- Single number should return that number
//- Two numbers separated by comma should return their sum
//- Multiple numbers separated by comma should return their sum
//- Numbers separated by newline should work as delimiter
//- Negative numbers should throw IllegalArgumentException
}
