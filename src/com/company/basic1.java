package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class basic1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4 == 0) {
            if(year%100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("es bisiesto");
                } else {
                    System.out.println("no es bisiseto");

                }

            } else {
                System.out.println("no es bisisesto");
            }
            }
        }
    }