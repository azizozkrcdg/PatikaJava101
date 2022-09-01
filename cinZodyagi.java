import  java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {

        int year, zodyag;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılı : ");
        year = input.nextInt();

        zodyag = year % 12;

        if (year > 0) {
            switch (zodyag) {
                case 0:
                    System.out.println("Çin zodyağı burcunuz : Maymun");
                    break;

                case 1:
                    System.out.println("Çin zodyağı burcunuz : Horoz");
                    break;

                case 2:
                    System.out.println("Çin zodyağı burcunuz : Köpek");
                    break;

                case 3:
                    System.out.println("Çin zodyağı burcunuz : Domuz");
                    break;

                case 4:
                    System.out.println("Çin zodyağı burcunuz : Fare");
                    break;

                case 5:
                    System.out.println("Çin zodyağı burcunuz : Öküz");
                    break;

                case 6:
                    System.out.println("Çin zodyağı burcunuz : Kaplan");
                    break;

                case 7:
                    System.out.println("Çin zodyağı burcunuz : Tavşan");
                    break;

                case 8:
                    System.out.println("Çin zodyağı burcunuz : Ejderha");
                    break;

                case 9:
                    System.out.println("Çin zodyağı burcunuz : Yılan");
                    break;

                case 10:
                    System.out.println("Çin zodyağı burcunuz : At");
                    break;

                case 11:
                    System.out.println("Çin zodyağı burcunuz : Koyun");
                    break;

                default:
                    isError = true;
            }

        }else {
            isError = true;
        }


        if (isError) {
            System.out.println("Lütfen geçerli bir değer giriniz !");
        }
    }
}
