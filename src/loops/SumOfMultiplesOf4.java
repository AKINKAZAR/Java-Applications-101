package loops;

import java.util.Scanner;

public class SumOfMultiplesOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        do {
            System.out.print("Numara giriniz: ");
            number = input.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("4 ve katlarının toplamı: " + sum);
    }
}
