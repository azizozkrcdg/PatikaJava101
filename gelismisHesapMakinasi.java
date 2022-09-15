import java.util.Scanner;

public class gelismisHesapMakinasi {

    static int total(int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Fark : " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }

    static int divide(int a, int b){
        if (b == 0){
            System.out.println("Bir sayı sıfıra bölünemez !");
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
            return result;
    }


    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *=a;
        }
        System.out.println("Üs Hesabı : " + result);
        return result;
    }

    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }

    static void calc(int a, int b){
        System.out.println("Çevre : " + 2 * (a + b));
        System.out.println("Alan : " + a * b);

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1 - Toplama\n" +
                "2 - Çıkarma\n" +
                "3 - Çarpma\n" +
                "4 - Bölme\n" +
                "5 - Üs Alma\n" +
                "6 - Mod Alma\n" +
                "7 - Dikdörtgen Çevre ve Alan Hesaplama\n" +
                "0 - Çıkış";
        System.out.println(menu);


        while (true){

            System.out.print("Bir işlem seçiniz : ");
            int select = input.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("Birinci Sayı : ");
            int a = input.nextInt();

            System.out.print("İkinci Sayı : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    total(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem seçiniz !");

            }

        }
        System.out.println("Görüşmek Üzere...");

    }
}
