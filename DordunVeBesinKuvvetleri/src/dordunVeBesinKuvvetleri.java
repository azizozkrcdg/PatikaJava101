import java.util.Scanner;
public class dordunVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Üst sınır sayısı giriniz : ");
        a = input.nextInt();

        System.out.println("4 ün kuvvetleri : ");
        for (int i = 1; i <= a; i*=4){
            System.out.println(i);
        }

        System.out.println();

        System.out.println("5 in kuvvetleri : ");
        for (int i = 1; i <=a; i*=5){
            System.out.println(i);
        }

    }
}
