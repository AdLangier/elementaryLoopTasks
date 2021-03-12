package com.company;

import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while(a!=b){                                             //Nie wiem dlaczego ten "if" jest tak skonstruowany
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.println("NWD 2 liczb wynosi: "+a);
    }
}
