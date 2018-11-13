package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] personas = new int[100];
        personas[0] = 99;


        int grupo = 0;
        for (int i = 1; personas[i - 1] != 0; i++) {
            personas[i] = scanner.nextInt();
            if (personas[i] != personas[i - 1]) {
                grupo++;
            }
        }

        System.out.println(grupo);


        {


        }


    }
}




