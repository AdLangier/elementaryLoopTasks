package com.company;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość gwiazdek");
        int n = scanner.nextInt();

        for (int i = 1; i <n ; i++) {
            System.out.print("*");
        }


    }

}
