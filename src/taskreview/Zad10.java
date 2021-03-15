package taskreview;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        String number = scanner.next();
        int digits = 0;

        for (int i = 0; i <number.length() ; i++) {
            digits++;

        }
        System.out.println("Ilość cyfr w podanej liczbie to "+digits);

    }
}
