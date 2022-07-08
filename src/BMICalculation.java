import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bodyWeight;
        double height, bmi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height =  input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        bodyWeight =input.nextInt();

        bmi = bodyWeight / Math.pow(height,2);
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    }
}
