package week1;

public class ex2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int mic = numbers[0];
        for (int x : numbers) {
            if (x < mic) {
                mic = x;
            }
        }
        System.out.println("Cel mai mic numar din sir este " + mic);
    }
}
