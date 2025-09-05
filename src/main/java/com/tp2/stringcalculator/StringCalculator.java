package com.tp2.stringcalculator;

public class StringCalculator {
    public static int suma(String numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        numeros = numeros.replace("\n", ",");
        String[] partes = numeros.split(",");

        int suma = 0;
        for (String valor : partes) {
            int n = Integer.valueOf(valor);
            if (n < 0) {
                throw new IllegalArgumentException("No se permiten números negativos");
            }
            suma += n;
        }
        return suma;
    }
}