package com.company;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserte un numero");
        int numero = scanner.nextInt();

        boolean algunohadadocero = false;

        for (int i = 2; i < numero; i++) {
            if (numero%i == 0) {
                algunohadadocero = true;
            }
        }

        if(algunohadadocero) {
            System.out.println("NO");
        }else{
            System.out.println("SI");
        }
    }
}

