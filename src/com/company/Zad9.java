package com.company;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        int factorial = 1;                                           // zmienna pomocnicza

        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i);
        }
        System.out.println("Silnia z "+n+" to "+factorial);
    }
}
