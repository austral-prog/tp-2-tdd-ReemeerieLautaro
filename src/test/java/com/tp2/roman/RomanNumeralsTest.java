package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    private final RomanNumerals converter = new RomanNumerals();

    @Test
    void exampleTest() {
        assertEquals("I", converter.convert(1));
        assertEquals("V", converter.convert(5));
        assertEquals("X", converter.convert(10));
        assertEquals("IV", converter.convert(4));
        assertEquals("IX", converter.convert(9));
        assertEquals("XL", converter.convert(40));
        assertEquals("L", converter.convert(50));
        assertEquals("XC", converter.convert(90));
        assertEquals("C", converter.convert(100));
        assertEquals("CD", converter.convert(400));
        assertEquals("D", converter.convert(500));
        assertEquals("CM", converter.convert(900));
        assertEquals("M", converter.convert(1000));
        assertEquals("MCMXCIV", converter.convert(1994));
    }
}


//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"

