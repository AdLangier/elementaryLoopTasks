package taskreview;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość wieży z \"O\"");
        int height = scanner.nextInt();                                      //Podpowiedź w Zad10 - TRUDNE

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("O");
            }
            System.out.println();
        }

    }
}
