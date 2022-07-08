package SimpleOperations;

import java.util.Scanner;

public class GradePointAverageCalculation {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        int ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = input.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalama Notu: " + ortalama);

        String sonuc = ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println("Geçme durumu:" + sonuc);
    }
}
