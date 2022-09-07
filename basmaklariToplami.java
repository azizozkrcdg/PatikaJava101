import java.util.Scanner;
public class basmaklariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz : ");
        int k = input.nextInt();
        int a;
        int total = 0;
        
        while(k > 0) {
            a = k % 10;
            total += a;

            k /=10;

        }
        System.out.println("Basamakların toplamı = "+total);


    }
}
