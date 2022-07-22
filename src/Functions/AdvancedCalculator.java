package Functions;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    public static void minus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
            } else {
                result -= number;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    public static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    public static void diveded() {
        Scanner input = new Scanner(System.in);
        double number, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();

            if (i == 1) {
                result += number;
            } else {
                result /= number;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    public static void power() {
        Scanner input = new Scanner(System.in);
        double baseNumber, exponentNumber, result;
        System.out.print("Taban değerini giriniz: ");
        baseNumber = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exponentNumber = input.nextInt();

        result = Math.pow(baseNumber, exponentNumber);
        System.out.println("Sonuç: " + result);
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);
        int number, result = 1;

        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    public static void mod() {
        Scanner input = new Scanner(System.in);
        int mainNumber, modNumber, result;

        System.out.print("1. sayıyı giriniz: ");
        mainNumber = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        modNumber = input.nextInt();

        result = mainNumber % modNumber;
        System.out.println("Sonuç: " + result);
    }

    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        int edge1, edge2, perimeter, area;

        System.out.print("1. Kenarı giriniz: ");
        edge1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        edge2 = input.nextInt();

        perimeter = 2 * (edge1 + edge2);
        area = edge1 * edge2;
        System.out.println("Çevre: " + perimeter);
        System.out.println("Alan: " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection, reSelection;

        boolean exit = true;
        boolean newProcess = true;
        do {

            if (newProcess) {
                System.out.println("1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme işlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Faktoriyel Hesaplama\n" +
                        "7- Mod Alma\n" +
                        "8- Dikdörtgen Alan ve Çevre Hesabı" +
                        "0- Çıkış Yap");
            } else {
                System.out.println("Çıkış yapılıyor..");
                break;
            }
            System.out.print("Bir işlem seçiniz: ");
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    diveded();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    exit = false;
                    System.out.println("Çıkış yapılıyor..");
                    break;
            }
            System.out.println("Yeni İşlem yapmak istiyor musunuz? \n" +
                    "1- Evet \n" +
                    "2- Hayır");
            reSelection = input.nextInt();

            if (reSelection == 2) {
                newProcess = false;
            }

        } while (exit);
    }
}
