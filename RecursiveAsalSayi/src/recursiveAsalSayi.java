import java.util.Scanner;

public class recursiveAsalSayi {

    static boolean asalBul(int number) {
        boolean asalMi = false;

        for (int i = 2; i < number ; i++){

            if (number % i == 0){
                asalMi = false;
                break;
            }else {
                asalMi = true;
            }
        }

        if (asalMi){
            System.out.println(number + " sayısı asaldır.");
        }else {
            System.out.println(number + " sayısı asal değildir.");
        }
        return asalMi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();


        asalBul(number);

    }
}
