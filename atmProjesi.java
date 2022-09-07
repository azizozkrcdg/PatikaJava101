import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        int hak = 3;
        int balance = 2000;
        int select;
        int price;

        while (hak > 0){
            System.out.print("Lütfen Kart Şifresini Giriniz : ");
            password = input.nextInt();

            System.out.println();

            if (password == 1453){
                System.out.println("Kazık Banka Hoşgeldiniz !");
                System.out.println();

                do {
                    System.out.println(" 1 - Para Yatırma\n 2 - Para Çekme\n 3 - Bakiye Sorgulama\n 4 - Çıkış");
                    System.out.println();
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println();
                            System.out.print("Yatırmak İstediğiniz Miktarı Giriniz : ");
                            price = input.nextInt();
                            if (price >= 20){
                                balance += price;
                                System.out.println("İşleminiz Gerçekleşti.");
                            }else {
                                System.out.println("Minimum 20 TL yatırabilirsiniz !");
                            }

                            break;
                        case 2:
                            System.out.println();
                            System.out.print("Çekmek İstediğiniz Miktarı Giriniz : ");
                            price = input.nextInt();
                            if (balance >= price && price >= 20){
                                balance -= price;
                                System.out.println("İşleminiz Gerçekleşti.");
                            }else if (price < 20){
                                System.out.println("Minimum 20 TL çekebilirsiniz !");
                            }else {
                                System.out.println();
                                System.out.println("Yetersiz Bakiye !");
                            }

                            break;
                        case 3:
                            System.out.println();
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println();
                            System.out.println("Tekrar Görüşmek Üzere");
                            break;
                    }

                }while (select != 4);
                break;

            }else {
                System.out.println("Hatalı Parola Girdiniz ! Lütfen Tekrar Deneyiniz.");
                hak--;
                if (hak == 0){
                    System.out.println("Kartınız bloke oldu ! Lütfen bankayla iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }

            }


        }


    }
}
