package com.tp2.roman;

public class RomanNumerals {
    
    public String convert(int number) {

        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,   4,   1};
        String[] symbols ={"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }
}
