import java.util.Scanner;
public class sinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik, toplam = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
            if((mat >= 0) && (mat <= 100)){
                toplam += mat;
            }else {
                System.out.println("Lütfen geçerli bir sayı giriniz !");
            }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
            if((turkce >= 0 ) && (turkce <= 100)){
                toplam += turkce;
            }else {
                System.out.println("Lütfen geçerli bir sayı giriniz !");
            }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
            if ((fizik >= 0) && (fizik <= 100)){
            toplam += fizik;
            }else {
            System.out.println("Lütfen geçerli bir sayı giriniz !");
            }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
            if((kimya >= 0) && (kimya <= 100)){
                toplam += kimya;
            }else {
                System.out.println("Lütfen geçerli bir sayı giriniz !");
            }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
            if((muzik >= 0) && (muzik <= 100)){
                toplam += muzik;
            }else {
                System.out.println("Lütfen geçerli bir sayı giriniz !");
            }

        double sonuc = toplam/5;

        if (sonuc >= 55){
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }else {
            System.out.println("Üzgünüz ! Sınıfı Geçemediniz.");
        }
        System.out.println("Ortalamanız : " + sonuc);



    }
}
