import java.util.Scanner;

public class InvertedTriangleWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k-- ) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
