package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int[] list = {1, 12, 422, 54, 0, 51, 20, 6, 123};
        int min = list[0];
        int max = list[0];

        Arrays.sort(list);
        System.out.print("Bir değer giriniz: ");
        number = input.nextInt();

        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın değer: " + max);
        System.out.println("Girilen sayıdan küçük en yakın değer: " + min);
    }
}
