package SimpleOperations;

import java.util.Scanner;

public class KDVAmountCalculation {
    public static void main(String[] args) {
        double kdvRate, originalPrice, lastPrice, kdvPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı Giriniz: ");
        originalPrice = input.nextDouble();

        kdvRate = (originalPrice > 0 && originalPrice < 1000) ? 0.18 : 0.08;
        System.out.println(kdvRate);
        kdvPrice = originalPrice * kdvRate;
        lastPrice = originalPrice + kdvPrice;

        System.out.println("KDV'siz Fiyat= " + originalPrice);
        System.out.println("KDV'li Fiyat= " + lastPrice);
        System.out.println("KDV Tutarı= " + kdvPrice);
    }
}
