package Arrays;

import java.util.Scanner;

public class MatrixTranspose {

    public static void makeTranspose(int[][] list1, int[][] list2) {

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list2[j][i] = list1[i][j];
            }
        }
    }

    public static void printArray(int[][] list) {

        for (int[] col : list) {
            for (int row : col) {
                System.out.print(row + "  ");
            }
            System.out.println();
        }
    }

    public static void getValeus(int[][] list1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                System.out.print("Dizinin [" + i + "][" + j + "] değeri:");
                list1[i][j] = scan.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        System.out.println("Dizinizin boyutlarını giriniz: ");
        System.out.print("Satır: ");
        row = scan.nextInt();
        System.out.print("Sütun: ");
        col = scan.nextInt();

        int[][] list = new int[row][col];
        int[][] transposeList = new int[col][row];

        getValeus(list);
        makeTranspose(list, transposeList);
        System.out.println("Matris:");
        printArray(list);
        System.out.println("Transpoze");
        printArray(transposeList);

    }
}
