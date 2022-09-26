import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        boolean isPrime = true;

        if (number == 1){
            System.out.println(number + " asay sayı değildir !");
            return;
        }

        if (number < 1){
            System.out.println("Geçersiz bir sayı girdiniz !");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " asal sayıdır !");
        } else {
            System.out.println(number + " asal sayı değildir !");
        }
    }
}
