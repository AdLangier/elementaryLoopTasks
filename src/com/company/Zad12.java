package com.company;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        StringBuilder secondWord = new StringBuilder(word);          //reverse() to metoda klasy StringBuilder
        secondWord.reverse();                                        //zamieniamy "word" na "secondWord" ze StringBuildera, używamy reverse().

        if (secondWord.toString().equals(word)){                     // ponownie zamieniamy na String i porównujemy do pierwotnego "word"
            System.out.println("Wyraz jest palindromem");
        }
        else{
            System.out.println("Wyraz nie jest palindromem");
        }

    }
}
