package Arrays;

import java.util.Scanner;

public class FrequencyValues {

    public static void takeValue(int[] list) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            list[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int listSize = scan.nextInt();
        int[] list = new int[listSize];

        takeValue(list);

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j] && (i != j)) {
                    count++;
                    list[j] = 0;
                }
            }
            if (list[i] != 0) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar etti.");
            }
        }
    }
}
