import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {

        // değişken tanımla
        int r, a;
        double alan, pi;

        // scanner tanımla
        Scanner input = new Scanner(System.in);

        // kullanıcıdan bilgi al

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısını giriniz : ");
        a = input.nextInt();

        pi = 3.14;
        alan = (pi*(r*r)*a)/360;

        System.out.print("Dairenin alanı : " + alan);



    }
}
