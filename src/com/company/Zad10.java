package com.company;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość wieżyczki");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {              //?????????TRUDNE????????????????????
                System.out.print("*");
            }
            System.out.println();
        }
        int spaces = n-1;
        System.out.println("Choinka:");
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 1; j <= 2 * (i-1)+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
