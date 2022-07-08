package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, tempNumber, mod, sum = 0, loopNumber = 0;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();
        tempNumber = number;

        while (tempNumber != 0){
            tempNumber /= 10;
            loopNumber++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            mod = tempNumber % 10;
            sum  += Math.pow(mod,loopNumber);
            tempNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " Bir Armstrong Sayısıdır.");
        } else {
            System.out.println(number + " Bir Armstrong Sayısı değildir.");
        }

    }
}
