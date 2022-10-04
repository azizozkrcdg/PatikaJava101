import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {

        // Değişkeneleri tanımla

        int a, b, c, u;
        double cevre, alan;

        // Scanner tanımla
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan bilgi al

        System.out.print("1. Kenar Uzunluğu: ");
        a = input.nextInt();
        System.out.print("2. Kenar Uzunluğu: ");
        b = input.nextInt();
        System.out.print("3. Kenar Uzunluğu: ");
        c = input.nextInt();

        u = (a+b+c)/2;
        cevre = u*2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı: "+alan);


    }
}
