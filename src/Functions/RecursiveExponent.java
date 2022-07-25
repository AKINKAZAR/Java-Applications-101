package Functions;

import java.util.Scanner;

public class RecursiveExponent {

    public static int power(int baseNumber, int exponentNumber) {

        if (exponentNumber == 1) {
            return baseNumber;
        }
        return power(baseNumber, exponentNumber - 1) * baseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baseNumber, exponentNumber;
        System.out.print("Taban değeri giriniz: ");
        baseNumber = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exponentNumber = input.nextInt();

        System.out.println("Sonuç: " + power(baseNumber, exponentNumber));
    }
}
