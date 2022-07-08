import java.util.Scanner;

public class CalculatingTheAreaOfACircleSlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, radius, area, circumference, sliceRadius, sliceArea;

        System.out.print("Dairenin Yarıçapını Giriniz: ");
        radius = input.nextDouble();

        System.out.print("Daire Diliminin Açısını Giriniz :");
        sliceRadius = input.nextDouble();

        area = pi * Math.pow(radius, 2);
        circumference = 2 * pi * radius;
        sliceArea = (area * sliceRadius) / 360;

        System.out.println("Dairenin Çevresi: " + circumference);
        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Daire Diliminin Alanı: " + sliceArea);
    }
}
