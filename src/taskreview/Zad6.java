package taskreview;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;                               // Przed pętlą do - while trzeba zadeklarować zmienną, którą użyjemy w "do"!!!!
        do {                                           //                    ||
            System.out.println("Podaj hasło");         //                    \/
            password = scanner.next();                 // przy wywołaniu tej zmiennej nie deklarujemy już typu !!!!!
        }while(!password.equals("Akademia"));          // porównanie "Stringów" -- equals() lub !...equals() - "nie prawda,że równe"
        System.out.println("Poprawne hasło!");
    }
}
