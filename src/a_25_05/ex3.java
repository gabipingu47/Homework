package a_25_05;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int n = scanner.nextInt();
        int result = 0;

        if (n > 0) {
            int max = Integer.MIN_VALUE;
            while (n > 0) {
                int digit = n % 10;
                max = Math.max(max, digit);
                n /= 10;
            }
            result = max;
        }
        System.out.println(result);
    }
}
