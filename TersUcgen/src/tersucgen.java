import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısı giriniz : ");
        int satirSayisi = input.nextInt();

        for (int satir = satirSayisi -1 ; satir >=0 ; satir--){
            for (int bosluk = 0 ; bosluk < satirSayisi -satir ; bosluk++){
                System.out.print(" ");
            }
            for (int yildiz = 0 ;yildiz < 1+(satir*2); yildiz++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
