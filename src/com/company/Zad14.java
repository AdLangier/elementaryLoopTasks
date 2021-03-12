package com.company;

import java.util.Scanner;

//Dodatkowe
public class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDivisors = 0;

        do {
            System.out.println("Podaj liczbę");                               //Trudne zadanie - połączenie pętli i instrukcji warunkowej
            int n = scanner.nextInt();
         //   int numberOfDivisors = 0;                                         //                 + zmienna pomocnicza


            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {                          // <---- instrukcja warunkowa "if" bez "else"  !!!
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors <= 2) {               // <--- warunek to "liczbaDzielników może wynosić maksymalnie 2
                System.out.println("Podana liczba jest liczbą pierwszą");     //     i nie może być zerem (określone również w pętli)
            } else {
                System.out.println("Podana liczba jest liczbą złożoną");
            }
        }while (numberOfDivisors !=0);
    }

}                                     //DODADKOWO - WRZUCIĆ POWTARZALNOŚĆ ZAPYTANIA O LICZBĘ (do - while)
