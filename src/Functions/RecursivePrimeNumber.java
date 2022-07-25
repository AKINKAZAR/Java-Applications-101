package Functions;

import java.util.Scanner;

public class RecursivePrimeNumber {

    public static boolean primaryNumber(int number, int divNumber) {

        if (number > divNumber) {
            if (number % divNumber == 0) {
                return true;
            } else {
                return primaryNumber(number, divNumber + 1);
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        if (primaryNumber(number, 2)) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            System.out.println(number + " sayısı ASALDIR !");
        }
    }
}
