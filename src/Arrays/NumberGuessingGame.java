package Arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner scan = new Scanner(System.in);

    public static void guessNumber(int randNumber) {
        int count = 0;
        boolean isWrong = false;
        boolean isWin = false;

        while (count < 5) {
            System.out.print("Tahmininizi Giriniz: ");
            int number = scan.nextInt();

            if (number < 0 || number > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - ++count));
                    System.out.println();
                } else {
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                    System.out.println();
                    isWrong = true;
                }
                continue;
            }

            if (randNumber == number) {
                System.out.println("Doğru tahmin, oyunu kazandınız!");
                isWin = true;
                break;
            } else {
                if (randNumber > number) {
                    System.out.println("Girilen sayı Tahmin Edilen Sayıdan Büyük!");
                } else {
                    System.out.println("Girilen sayı Tahmin Edilen Sayıdan Küçük!");
                }
                System.out.println("Yanlış tahmin, kalan hak sayınız: " + (5 - ++count));
                System.out.println();
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        System.out.println(randNumber);
        guessNumber(randNumber);


    }
}
