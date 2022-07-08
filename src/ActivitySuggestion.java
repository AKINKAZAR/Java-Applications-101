import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {

        int degree;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava kaç derece: ");
        degree = input.nextInt();

        if (degree < 5) {   // 1. YÖntem
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (degree < 10) {
            System.out.println("Sinemaya Gidebilrisiniz.");
        } else if (degree < 15) {
            System.out.println("Sinemaya veya Pikniğe gidebilirsiniz.");
        } else if (degree < 25) {
            System.out.println("Piknik Yapabilirsiniz.");
        } else {
            System.out.println("Yüzme Etkinliği Yapabilirsiniz");
        }

        System.out.println("---------------------------------------------");

        if (degree < 5) {   // 2. Yöntem
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (degree < 25) {

            if (degree <= 15) {
                System.out.println("Sinemaya Gidebilrisiniz.");
            }
            if (degree >= 10) {
                System.out.println("Piknik Yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzme Etkinliği Yapabilirsiniz");
        }
    }
}
