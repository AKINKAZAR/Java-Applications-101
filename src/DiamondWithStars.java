

public class DiamondWithStars {
    public static void main(String[] args) {

        int n = 9;

        for (int i = 1; i <= n; i++) {

            if (i < 6) {
                for (int k = 1; k <= (n - i); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int t = 1; t <= n + i - 10; t++) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= 2*(n-i)+1; y++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
