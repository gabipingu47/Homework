package main.java.week1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce-ti numarul pentru care doriti calcularea factorialului ");
        int x = scan.nextInt();
        int suma = 1;
        for (int i = 1; i <= x; i++) {
            suma = suma * i;
        }
        System.out.println("Factorialul numarului " + x + " este " + suma);
    }
}
