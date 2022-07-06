import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum;
        boolean isPerfectNumber = true;


        while (isPerfectNumber) {
            System.out.print("Bir sayı giriniz:");
            number = input.nextInt();
            sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " Mükemmel sayıdır");
            } else {
                System.out.println(number + " Mükemmel sayı değildir");
                isPerfectNumber = false;
            }
        }


    }
}
