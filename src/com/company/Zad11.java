package com.company;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
                System.out.print(word.charAt(i)+" ");
            }
        }
    }
}
