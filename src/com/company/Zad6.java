package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number1 = random.nextInt();
        int number;                                        // Przed pętlą do - while trzeba zadeklarować zmienną, którą użyjemy w "do"!!!!
        do {                                                //                    ||
            System.out.println("Zgaduj liczbę");            //                    \/
            number = scanner.nextInt();                     // przy wywołaniu tej zmiennej nie deklarujemy już typu !!!!!
        }while(number != number1);
        System.out.println("Brawo! odgadłeś liczbę");
    }

}
