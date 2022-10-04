import java.util.Scanner;
public class ciftSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, total = 0;

        do {
            System.out.print("Bir sayı giriniz : ");
            x = input.nextInt();

            if (x % 2 == 0){
                total += x;
            }

        }while (x % 2 == 0);

        System.out.println("Girilen çift sayıların toplamı : " + total);
    }
}
