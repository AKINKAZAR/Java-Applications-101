import java.util.Scanner;

public class AirlineTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distanceKm, passengerAge, tripType;
        double perKM = 0.10, totalPrice, discountPrice, discountTypePrice;
        double discountUnder12 = 0.50, discountBetween12To24 = 0.10, discountOver65 = 0.30, discountTripType = 0.20;
        boolean isError = false;

        System.out.print("Mesafeyi km türünden giriniz: ");
        distanceKm = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        passengerAge = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tripType = input.nextInt();

        totalPrice = distanceKm * perKM;

        if (distanceKm > 0 && passengerAge >= 0) {
            if (tripType == 1 || tripType == 2) {
                if (passengerAge < 12) {
                    discountPrice = totalPrice * discountUnder12;
                    totalPrice -= discountPrice;
                } else if (passengerAge <= 24) {
                    discountPrice = totalPrice * discountBetween12To24;
                    totalPrice -= discountPrice;
                } else if (passengerAge > 65) {
                    discountPrice = totalPrice * discountOver65;
                    totalPrice -= discountPrice;
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (tripType == 2) {
            discountTypePrice = totalPrice * discountTripType;
            totalPrice -= discountTypePrice;
            totalPrice *= 2;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz! ");
        } else {
            System.out.println("Toplam Tutar = " + totalPrice);
        }
    }
}
