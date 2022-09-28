import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        System.out.print("Liste içerisinde aranacak sayıyı giriniz : ");
        int aranacakSayi = input.nextInt();
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi){
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println(aranacakSayi + " sayısı listede mevcuttur.");
        }else {
            System.out.println(aranacakSayi + " sayısı listede mevcut değildir.");
        }
    }
}
