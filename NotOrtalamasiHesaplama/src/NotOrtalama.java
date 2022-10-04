import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        // Değişkenler
       double mat, turkce, tarih, cog, anayasa;

       //scanner sınıfını tanımla
     Scanner input = new Scanner(System.in);

       // kullanıcıdan bilgi al
     System.out.println("NOT ORTALAMASI HESAPLAMA PROGRAMI");

     System.out.print("Matematik Notunuz: ");
     mat = input.nextDouble();

     System.out.print("Türkçe Notunuz: ");
     turkce = input.nextDouble();

     System.out.print("Tarih Notunuz: ");
     tarih = input.nextDouble();

     System.out.print("Coğrafya Notunuz: ");
     cog = input.nextDouble();

     System.out.print("Anayasa Notunuz: ");
     anayasa = input.nextDouble();

     double sonuc = (mat+turkce+tarih+cog+anayasa)/5;
     System.out.print("Durum: ");
     String kosul = sonuc < 60 ? "Kaldı" : "Geçti";

     System.out.print(kosul);






    }
}
