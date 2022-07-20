package Functions;

import java.util.Scanner;

public class PalindromNumber {
    public static boolean isPalindrom(int number) {

        int reverseNumber = 0, temp = number;
        boolean isPalindrom = false;

        while (temp != 0) {
            int a = temp % 10;
            reverseNumber = (reverseNumber * 10) + a;
            temp /= 10;
        }

        if (reverseNumber == number) {
            isPalindrom = true;
        }

        if (isPalindrom) {
            System.out.println(number + " Bir Palindrom Sayıdır!");
        } else {
            System.out.println(number + " Bir Palindrom Sayı Değildir!.");
        }

        return isPalindrom;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        isPalindrom(number);

    }
}
