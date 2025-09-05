package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    @Test
    void stringVacio() {
        assertEquals(0, StringCalculator.suma(""));
    }
    @Test
    void unNumero() {
        assertEquals(1, StringCalculator.suma("1"));
    }
    @Test
    void dosNumeros() {
        assertEquals(3, StringCalculator.suma("1,2"));
    }
    @Test
    void multiplesNumeros() {
        assertEquals(6, StringCalculator.suma("1,2,3"));
    }
    @Test
    void saltosDeLinea() {
        assertEquals(6, StringCalculator.suma("1\n2,3"));
    }
    @Test
    void numerosNegativosExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.suma("1,-2");
        });
    }
}