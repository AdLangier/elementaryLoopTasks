package com.company;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.next();

        System.out.print("Twoje imię co dwa: ");               // Napis niezależny musi być umieszczony poza pętlą, inaczej wyswietli się tyle razy ile pętla
        for (int i = 0; i <name.length() ; i+=2) {             // pętla przeskakuje o dwa !!!
            System.out.print(name.charAt(i));
        }

    }
}
