import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, condition1, condition2, condition3;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        condition1 = year % 4;
        condition2 = year % 100;
        condition3 = year % 400;

        if (condition1 == 0) {
            if (condition2 == 0) {
                if (condition3 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
            } else {
                System.out.println(year + " bir artık yıldır!");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
