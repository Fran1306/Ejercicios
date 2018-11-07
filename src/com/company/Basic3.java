package com.company;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int N1 = scanner.nextInt();
        boolean var1 = false;
        for (int i = 2; i < N1 - 1; i++) {
            System.out.println("No es un numero primo");
            var1 = true;
            break;

            }

        if(var1 == false){
        System.out.println("Es un número Primo");
    }else if(var1 == false) {
        System.out.println("Error");
    }
    }

}