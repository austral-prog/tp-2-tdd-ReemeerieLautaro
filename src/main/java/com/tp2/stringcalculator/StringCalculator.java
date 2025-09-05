package com.tp2.stringcalculator;

public class StringCalculator {
    
    public int add(String numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        numbers = numbers.replace("\n", ",");

        String[] tokens = numbers.split(",");
        int sum = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token.trim());

            if (num < 0) {
                throw new IllegalArgumentException("Números negativos no permitidos: " + num);
            }

            sum += num;
        }

        return sum;
    }
}



