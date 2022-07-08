import java.util.Scanner;

public class SumOfMod3and4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number, sum = 0, j = 0, average;

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                j++;
            }
        }

        if (j > 0) {
            average = sum / j;
        } else {
            average = 0;
        }
        System.out.println("Sonuç: " + average);
    }
}
