package a_25_05;

public class ex2b {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int mic = numbers[0];
        for (int numar : numbers) {
            if (numar > mic)
            System.out.println("Cel mai mic numar este " + mic);
        }
    }
}
