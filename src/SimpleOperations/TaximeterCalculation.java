package SimpleOperations;

import java.util.Scanner;

public class TaximeterCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double startPrice = 10, perKm = 2.20, km, amount, paymentAmount;

        System.out.print("Yolculuk kaç Km sürdü: ");
        km = input.nextDouble();

        amount = (perKm * km) + startPrice;

        paymentAmount = (amount > 20) ? amount : 20;
        System.out.println("Ödenecek Ücret: " + paymentAmount);
    }
}
