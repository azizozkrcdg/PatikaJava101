import java.util.Scanner;
public class maxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz : ");
        int pieces = input.nextInt();

        int number, max = 0, min = 0;

        for (int i = 1; i <= pieces; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number >= max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}
