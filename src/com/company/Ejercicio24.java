package com.company;

import java.sql.SQLOutput;

public class Ejercicio {

    public static void main(String[] ar) {
        int [] cambios = { 3, 2, 0, 1, 4, 6, 5, 8, 7};

        int numeroCambios = 1;

        for (int i= 0; i < cambios.length ; i++) {
            while (cambios[i] != i) {
                int meloguardo = cambios[i];
                cambios[i] = cambios[cambios[i]];
                cambios[meloguardo] = meloguardo;
                numeroCambios++;

                System.out.println(numeroCambios);
            }
        }

    }
}
