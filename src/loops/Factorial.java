package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, sum = 1;

        System.out.print("Bir sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            sum *= i;
        }
        System.out.println(sum);


    }
}
