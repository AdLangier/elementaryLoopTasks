package taskreview;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        int numberOfDivisors = 0;                                // Zmienna Pomocnicza :)

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {                              // WAŻNE! - zapisać odpowiedni warunek - podpowiedź w Zad14
                numberOfDivisors++;
            }
        }
        System.out.println("Liczba dzielników podanej liczby to " + numberOfDivisors);

    }
}
