import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String[] args) {

        // değişlkenleri tanımla
        double km, perKm, total, startPrice;

        // scanner tanımla
        Scanner input = new Scanner(System.in);

        // kullanıcıdan bilgi al
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextDouble();
        perKm = 2.20;
        startPrice = 10;

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.print("Toplam Tutar : " + total);





    }
}
