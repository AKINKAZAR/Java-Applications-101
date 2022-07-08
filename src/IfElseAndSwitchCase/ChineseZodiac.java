package IfElseAndSwitchCase;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear, zodiacNumber;
        String zodiacName = "";
        boolean isError = false;

        System.out.print("Doğum yılınızı Giriniz: ");
        birthYear = input.nextInt();

        zodiacNumber = birthYear % 12;
        if (birthYear > 0) {
            switch (zodiacNumber) {
                case 0:
                    zodiacName = "Maymun";
                    break;
                case 1:
                    zodiacName = "Horoz";
                    break;
                case 2:
                    zodiacName = "Köpek";
                    break;
                case 3:
                    zodiacName = "Domuz";
                    break;
                case 4:
                    zodiacName = "Fare";
                    break;
                case 5:
                    zodiacName = "Öküz";
                    break;
                case 6:
                    zodiacName = "Kaplan";
                    break;
                case 7:
                    zodiacName = "Tavşan";
                    break;
                case 8:
                    zodiacName = "Ejderha";
                    break;
                case 9:
                    zodiacName = "Yılan";
                    break;
                case 10:
                    zodiacName = "At";
                    break;
                case 11:
                    zodiacName = "Koyun";
                    break;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız!!");
        } else {
            System.out.println("Çin Zodyağı Burcunuz: " + zodiacName);
        }

    }
}
