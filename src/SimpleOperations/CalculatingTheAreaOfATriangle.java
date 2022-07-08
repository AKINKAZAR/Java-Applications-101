package SimpleOperations;

import java.util.Scanner;

public class CalculatingTheAreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  a, b,c,u, triangleArea;
        System.out.print("1. Kenar Uzunluğu: ");
        a = input.nextInt();
        System.out.print("2. Kenar Uzunluğu: ");
        b = input.nextInt();
        System.out.print("3. Kenar Uzunluğu: ");
        c= input.nextInt();

        u = (a + b + c)/2;
        triangleArea = Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.println("Üçgenin Alanı: " + triangleArea);
    }
}
