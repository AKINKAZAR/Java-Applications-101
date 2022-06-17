import java.util.Scanner;

public class ExponentsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baseNumber, powerNumber, result = 1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        baseNumber = input.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        powerNumber = input.nextInt();

        for (int i = 1; i <= powerNumber; i++) {
            result *=baseNumber;
        }

        System.out.println(baseNumber + "^" + powerNumber + ": " + result);
    }
}
