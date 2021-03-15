package taskreview;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = (factorial*i);                     //po obrocie pętli zmienna factorial ma już zwiększoną wartość w pamięci
        }
        System.out.println("Silnia z "+number+" to "+factorial);
    }
}
