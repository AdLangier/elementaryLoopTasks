package taskreview;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość początkowych liczb parzystych");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            if(i%2 != 0)                                 //warunek z wymuszeniem dla liczb parzystych!!
                continue;
            sum=(sum+i);
        }
        System.out.println("Suma liczb parzystych do "+n+" włącznie, wynosi "+sum);

    }
}
