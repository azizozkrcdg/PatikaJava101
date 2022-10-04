import java.util.Scanner;
public class usAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sayi, kuvvet, total = 1;

        System.out.print("Kuvveti Alıancak Sayıyı Giriniz : "  );
        sayi = input.nextInt();

        System.out.print("Kuvvet Giriniz : ");
        kuvvet = input.nextInt();

        for (long i = 1; i <= kuvvet; i++){
            total *= sayi;
        }
        System.out.print(total);


    }
}
