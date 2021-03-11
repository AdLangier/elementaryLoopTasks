package com.company;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int n = scanner.nextInt();
        int sum = 0;                                         //zmienna pomocnicza
        for (int i = 1; i <=n; i++) {
            sum = (sum+i);
        }
        System.out.println("Suma to "+sum);

    }
}
