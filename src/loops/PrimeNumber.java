package loops;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPerfectNumber;

        for (int i = 2; i <= 100; i++) {
            isPerfectNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPerfectNumber = false;
                    break;
                }
            }
            if (isPerfectNumber) {
                System.out.print(i + " ");
            }
        }
    }
}