package com.company;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.nextLine();                                   //identyczne jak zadanie 12
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();

        System.out.println("Wyraz odwrotny to "+reversedWord);

    }
}
