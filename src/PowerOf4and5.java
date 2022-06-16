import java.util.Scanner;

public class PowerOf4and5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }


       /*  2. çözüm yolu
       System.out.print("Bir Sayı Giriniz: ");
       number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (Math.pow(4, i) <= number) {
                System.out.println("4 sayısının " + i + ". üssü " + Math.pow(4, i));
            }
        }
        for (int i = 0; i <= number; i++) {
            if (Math.pow(5, i) <= number) {
                System.out.println("5 sayısının " + i + ". üssü " + Math.pow(5, i));
            }
        }
        */
    }
}
