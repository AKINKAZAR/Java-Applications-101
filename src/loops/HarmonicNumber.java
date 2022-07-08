package loops;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        double sum = 0;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++){
            sum += 1/i;
        }

        System.out.println(sum);
    }
}
