public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        String zodiac = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Sayı olarak Giriniz: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü Sayı olarak Giriniz: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Oğlak Burcu";
                } else {
                    zodiac = "Kova Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    zodiac = "Kova Burcu";
                } else {
                    zodiac = "Balık Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiac = "Balık Burcu";
                } else {
                    zodiac = "Koç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiac = "Koç Burcu";
                } else {
                    zodiac = "Boğa Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Boğa Burcu";
                } else {
                    zodiac = "İkizler Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "İkizler Burcu";
                } else {
                    zodiac = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Yengeç Burcu";
                } else {
                    zodiac = "Aslan Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Aslan Burcu";
                } else {
                    zodiac = "Başak Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Başak Burcu";
                } else {
                    zodiac = "Terazi Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Terazi Burcu";
                } else {
                    zodiac = "Akrep Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Akrep Burcu";
                } else {
                    zodiac = "Yay Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Yay Burcu";
                } else {
                    zodiac = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız.");
        } else {
            System.out.println(month + " " + day + " " + zodiac);
        }
    }
}
