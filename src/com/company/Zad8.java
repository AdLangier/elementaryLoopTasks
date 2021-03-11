package com.company;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String rightPassword = "Polska";                           //zmienna pomocnicza
        do {
            System.out.println("Podaj hasło");
            password = scanner.nextLine();
        }while(!password.equals(rightPassword));              // uwaga na warunek logiczny
        System.out.println("Zajebiście! Hasło odgadnięte");
    }
}
