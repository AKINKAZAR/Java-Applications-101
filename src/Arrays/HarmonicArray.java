package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HarmonicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double[] list = new double[5];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Listenin " + i + ". elemanı: ");
            list[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(list));
        for (double i : list) {
            sum += 1 / i;
        }
        System.out.println("Dizinin Harmonik Ortalaması: " + list.length / sum);

    }

}
