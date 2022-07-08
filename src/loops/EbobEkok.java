package loops;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, forNumber;
        int ebob = 1;
        int ekok;


        System.out.print("Birinci Sayıyı Giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        number2 = input.nextInt();

        forNumber = Math.min(number1, number2);

        int i = 1;
        while (i < forNumber) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("En Büyük Ortak Bölen: " + ebob);
        ekok = (number1 * number2) / ebob;
        System.out.println("En Küçük Ortak Kat: " + ekok);
    }
}

