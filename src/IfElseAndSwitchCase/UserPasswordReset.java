package IfElseAndSwitchCase;

import java.util.Scanner;

public class UserPasswordReset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;
        int resetPassword;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız.");
        } else {
            System.out.println("Giriş Yapılamadı.");

            System.out.print("Şifrenizi Sıfırlamak istiyorrsanız 1'i tuşlayınız: ");
            resetPassword = input.nextInt();

            if (resetPassword == 1) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                input.nextLine(); // resetPassword = input.nextInt(); kodu kullanıldığında boşluk varmış gibi görüyor.Okumadan Atlama yapmaması için kullandım
                newPassword = input.nextLine();

                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Yeni Şifre Ataması Yapılmadı.");
            }
        }
    }
}
