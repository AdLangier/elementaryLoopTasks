package com.company;

public class Zad3 {
    public static void main(String[] args) {
        for (int i = 5; i <=50 ; i++) {
            if (i%2==0){                     //dla parzystych wymusza ponowne uruchomienie pętli
                continue;
            }
            System.out.println(i);

        }
    }
}
