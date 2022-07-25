package Functions;

import java.util.Scanner;

public class RecursivePrimeNumber {

    public static int primaryNumber(int number, int divNumber) {

        if (number > divNumber) {
            if (number % divNumber == 0) {
                return 1;
            }
            return primaryNumber(number, divNumber + 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        if (primaryNumber(number, 2) == 1) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            System.out.println(number + " sayısı ASALDIR !");
        }
    }
}
