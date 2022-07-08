package loops;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        int price;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev1234")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            if (balance >= price) {
                                balance -= price;
                            } else {
                                System.out.println("Bakiye yetersiz.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor..");
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                if (right != 0) {
                    System.out.println("Kullanıcı Adı Veya Şifre Hatalı. Tekrar Deneyiniz.");

                } else {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
            }
        }
    }
}
