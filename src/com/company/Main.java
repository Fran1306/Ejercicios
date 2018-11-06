package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int uvas = 100;

        while(uvas !=0) {
            uvas = teclado.nextInt();

            int niveles = 0;
            int total = 0;

            while (uvas > total) {
                niveles++;
                total = niveles + total;
            }

            if(niveles != 0) {
                System.out.println(niveles);
            }
        }

    }
}
