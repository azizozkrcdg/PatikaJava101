import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

      double fiyat, kdvOrani, kdvFiyati, kdvliFiyat;

      Scanner input = new Scanner(System.in);

      System.out.print("Fiyat Giriniz: ");
      fiyat = input.nextDouble();

      kdvOrani = (fiyat < 1000) ? 0.18 : 0.08;
      kdvFiyati = fiyat*kdvOrani;
      kdvliFiyat = fiyat + kdvFiyati;

        System.out.println("Fiyat: "+fiyat);
        System.out.println("Kdv Oranı: "+kdvOrani);
        System.out.println("Kdv Fiyatı: "+kdvFiyati);
        System.out.println("Kdvli Fiyat: "+kdvliFiyat);



        }

    }