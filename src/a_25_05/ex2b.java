package week1;

public class ex2b {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int min = numbers[0];
        for (int numar : numbers) {
            if (numar < min) {
                min = numar;
            }

        }
        System.out.println("Cel mai mic numar este " + min);
    }
}
