import java.util.Scanner;

public class kitleİndeksi {
    public static void main(String[] args) {

        // değişkenleri tanımla
        float boy, kilo, indeks;

        // scanner tanımla
        Scanner girdi = new Scanner(System.in);

        // kullanıcıdan bilgi al
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = girdi.nextFloat();

        System.out.print("Lütfen Kilonuzu  Cinsinden Giriniz : ");
        kilo = girdi.nextFloat();

        // formül
        indeks = kilo / (boy*boy);

        // ekrana yazdır
        System.out.print("Vücut kitle indeksiniz : " + indeks);

    }
}
