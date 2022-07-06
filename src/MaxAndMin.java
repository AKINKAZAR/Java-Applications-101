import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfNumbers, number;
        int maxNumber = 1, minNumber = 1;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        numberOfNumbers = input.nextInt();

        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (i == 1) {
                maxNumber = number;
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("En büyük sayı: " + maxNumber);
        System.out.println("En küçük sayı: " + minNumber);


    }
}
