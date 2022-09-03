import java.util.Scanner;
public class uceVeDordeBolunenSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();

        System.out.println("Girdiğiniz sayıya kadar 3'e ve 4'e tam bölünebilen sayılar : ");
        for (int i = 0; i <= a; i++ ){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }
        }


    }
}
