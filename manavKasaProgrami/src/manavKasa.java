import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        // değişkenleri tanımla
        double armutFiyat, armutKg, elmaFiyat, elmaKg, domatesFiyat, domatesKg, muzFiyat, muzKg, patlicanFiyat, patlicanKg,toplamTutar;

        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5.00;

        // scanner tanımla
        Scanner input = new Scanner(System.in);

        // kullanıcıdan bilgi al

        System.out.print("Kaç kilo Armut : ");
        armutKg = input.nextDouble();
        armutKg = armutKg * armutFiyat;

        System.out.print("Kaç kilo Elma : ");
        elmaKg = input.nextDouble();
        elmaKg = elmaKg * elmaFiyat;

        System.out.print("Kaç kilo Domates : ");
        domatesKg = input.nextDouble();
        domatesKg = domatesKg * domatesFiyat;

        System.out.print("Kaç kilo Muz : ");
        muzKg = input.nextDouble();
        muzKg = muzKg * muzFiyat;

        System.out.print("Kaç kilo Patlıcan : ");
        patlicanKg = input.nextDouble();
        patlicanKg = patlicanKg * patlicanFiyat;

        toplamTutar = (armutKg + elmaKg + domatesKg + muzKg + patlicanKg);
        System.out.print("Toplam Tutar : " + toplamTutar + " TL");







    }
}
