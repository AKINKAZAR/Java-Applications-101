package loops;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = n; a >= 1; a--) {
            for (int b = 0; b <= (n - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
