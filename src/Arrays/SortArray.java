package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void sortArray(int[] list) {
        int temp;
        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void takeValue(int[] list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu n: " + list.length);
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        int[] list = new int[5];
        takeValue(list);
        sortArray(list);
        System.out.println("Sıralama: " + Arrays.toString(list));

    }
}
