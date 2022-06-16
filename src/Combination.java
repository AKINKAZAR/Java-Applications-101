import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, numberFactorial = 1, subsetNumber, subsetNumberFactorial = 1, sum, sumFactorial = 1, result = 0;
        boolean isError = true;
        boolean isNumberPositive = true;
        boolean isSubsetNumberPositive = true;

        System.out.print("Kümenin Eleman Sayısını Giriniz: ");
        number = input.nextInt();
        if (number <= 0) {
            isNumberPositive = false;
        }

        System.out.print("İstenilen Alt Küme Sayısı: ");
        subsetNumber = input.nextInt();
        if (subsetNumber <= 0) {
            isSubsetNumberPositive = false;
        }

        if (isNumberPositive && isSubsetNumberPositive) {
            if (number >= subsetNumber) {
                for (int i = 1; i <= number; i++) {
                    numberFactorial *= i;
                }

                for (int i = 1; i <= subsetNumber; i++) {
                    subsetNumberFactorial *= i;
                }

                sum = number - subsetNumber;
                for (int i = 1; i <= sum; i++) {
                    sumFactorial *= i;
                }

                result = numberFactorial / (subsetNumberFactorial * sumFactorial);
            } else {
                isError = false;
            }

            if (isError) {
                System.out.println("C(n,r): " + result);
            } else {
                System.out.println("Alt Küme Eleman sayısı Ana Kümenin Eleman Sayısından Büyük Olamaz!!");
            }
        } else {
            System.out.println("Küme ve Alt Küme sayısı 1 den küçük olamaz.");
        }
    }
}
