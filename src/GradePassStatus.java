import java.util.Scanner;

public class GradePassStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mathematicNote, physicsNote, turkishNote, chemistryNote, musicNote;
        double average = 0;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mathematicNote = input.nextInt();

        System.out.print("Fzik Notunuzu Giriniz: ");
        physicsNote = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkishNote = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        chemistryNote = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        musicNote = input.nextInt();

        if (mathematicNote >= 0 && mathematicNote <= 100) {
            average += mathematicNote;
        }
        if (physicsNote >= 0 && physicsNote <= 100) {
            average += physicsNote;
        }
        if (turkishNote >= 0 && turkishNote <= 100) {
            average += turkishNote;
        }
        if (chemistryNote >= 0 && chemistryNote <= 100) {
            average += chemistryNote;
        }
        if (musicNote >= 0 && musicNote <= 100) {
            average += musicNote;
        }

        System.out.println("Ortalamanız: " + (average / 5));

        if (average < 55) {
            System.out.println("Sen Kaldın Kardeşş, Sen Kaldınnn!!");
        } else {
            System.out.println("Hadi Yine İyisin Geçtin!!");
        }
    }
}
