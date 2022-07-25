package Functions;

import java.util.Scanner;

public class RecursivePattern {

    public static int pattern(int number, int controlNumber, int controlNumber2) {
        if (controlNumber > 0) {
            if (number >= 0) {
                System.out.print(number + " ");
                return pattern(number - 5, controlNumber - 5, controlNumber2);
            }
        } else {
            if (controlNumber2 >= number){
                System.out.print(number + " ");
                return pattern(number + 5, controlNumber, controlNumber2);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, controlNumber, controlNumber2;
        System.out.print("N sayısı: ");
        number = input.nextInt();
        controlNumber = number;
        controlNumber2 = number;
        pattern(number, controlNumber, controlNumber2);

    }
}
