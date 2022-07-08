import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0, n2;
        System.out.print("Serinin Kaça Kadar Gitmesi Gerekiyor:");
        int count = input.nextInt();

        for (int i = 1; i <= count; i = n2) {
            n2 = n1 + i;
            System.out.println(n1 + " + " + i + " = " + n2);
            System.out.println();
            n1 = i;
        }
    }
}
