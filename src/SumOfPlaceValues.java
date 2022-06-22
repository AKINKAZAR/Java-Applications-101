import java.util.Scanner;

public class SumOfPlaceValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, modValue, sum = 0;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        while (number != 0) {
            modValue = number % 10;
            sum += modValue;
            number /= 10;
        }
        System.out.println(sum);
    }
}
