package com.company;

import java.util.Scanner;

//Dodatkowe
public class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");                               //Trudne zadanie - połączenie pętli i instrukcji warunkowej
        int n = scanner.nextInt();                                        //                 + zmienna pomocnicza
        int numberOfDivisors = 0;

        for (int i = 1; i <=n ; i++) {
            if (n % i == 0) {                          // <---- instrukcja warunkowa "if" bez "else"  !!!
                numberOfDivisors++;
            }
        }
        if(numberOfDivisors <= 2 && numberOfDivisors != 0){               // <--- warunek to "liczbaDzielników może wynosić maksymalnie 2
            System.out.println("Podana liczba jest liczbą pierwszą");     //     i nie może być zerem (określone również w pętli)
        }
        else{
            System.out.println("Podana liczba jest liczbą złożoną");
        }
    }
}                                //DODADKOWO - WRZUCIĆ POWTARZALNOŚĆ ZAPYTANIA O LICZBĘ (do - while)
