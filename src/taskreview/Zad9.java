package taskreview;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            if(i%7 != 0)                                 //warunek z wymuszeniem dla liczb podzielnych przez 7!!
                continue;                                // IDENTYCZNE JAK ZADANIE POPRZEDNIE!!!
            sum=(sum+i);
        }
        System.out.println("Suma liczb podzielnych przez 7 od 0 do "+n+" włącznie, wynosi "+sum);

    }
}
