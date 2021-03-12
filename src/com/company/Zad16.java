package com.company;

import java.util.Scanner;
//TRUDNE
public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź napis");
        String inscription = scanner.nextLine();                    //Rozwiązanie w Zad14 - liczby pierwsze i złożone
        int lowerCaseCounter = 0;          //<-- zmienna pomocnicza

        for (int i = 0; i < inscription.length(); i++) {
            if (Character.isLowerCase(inscription.charAt(i)))
                lowerCaseCounter++;

        }
        System.out.println(lowerCaseCounter);
    }
}
