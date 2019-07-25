package a_25_05;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //variabilele incep cu litera mica
        int[] Primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduce numarul");
        String primenumber = numar.nextLine();
        System.out.println("Numarul ales este: " + primenumber);
        int number = Primes[0];
//        for (int x : Primes)
//            for (int i; i <= primenumber; i--) {
//                System.out.println("Numerele prime mai mici decat " + primenumber + "sunt" + x);
//            }
    }
}
