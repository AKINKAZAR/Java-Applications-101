package IfElseAndSwitchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, process;
        float result;

        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlem için tuşlayınız.");
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Seçim: ");
        process = input.nextInt();

        switch (process) {
            case 1:
                result = number1 + number2;
                System.out.println("İşlem Sonucu: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("İşlem Sonucu: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("İşlem Sonucu: " + result);
                break;
            case 4:
                switch (number1) {
                    case 0:
                        System.out.println("Bir sayı sıfıra bölünemez.");
                        break;
                    default:
                        result = (float) number1 / number2;
                        System.out.println("İşlem Sonucu: " + result);
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
        }
    }
}
