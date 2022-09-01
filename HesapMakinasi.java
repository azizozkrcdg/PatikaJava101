import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

       int num1, num2, select;

       Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-:Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.print("Sayıların toplamı : " + (num1 + num2));
                break;
            case 2:
                System.out.print("Sayıların farkı : " + (num1 - num2));
                break;
            case 3:
                System.out.print("Sayıların çarpımı : " + (num1*num2));
                break;
            case 4:
                switch (num2){
                    case 0:
                        System.out.print("Geçersiz bir giriş yaptınız!");
                        break;
                    default:
                        System.out.print("Sayıların bölümü : " + (num1 / num2));
                }
        }



        }
    }

