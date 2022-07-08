import java.util.Scanner;

public class GroceryStoreProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearPerKg = 2.14, applePerKg = 3.67, tomatoesPerKg = 1.11, bananaPerKg = 0.95, auberginePerKg = 5.0, totalPrice;
        int pearKg, appleKg, tomatoesKg, bananaKg, aubergineKg;

        System.out.print("Armut Kaç Kilo ? :");
        pearKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        appleKg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        tomatoesKg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        bananaKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        aubergineKg = input.nextInt();

        totalPrice = (pearKg * pearPerKg) + (appleKg * applePerKg) + (tomatoesKg * tomatoesPerKg) + (bananaKg * bananaPerKg) + (aubergineKg * auberginePerKg);
        System.out.println("Toplam Tutar: " + totalPrice +" TL");
    }
}
