import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        int number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int number2 = input.nextInt();
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 += i;
            }
        }

        if (number1 == total2 && number2 == total1) {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayıdır.");
        }else {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayı değildir.");
        }
    }
}
