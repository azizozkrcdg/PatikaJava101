import java.util.Scanner;
public class harmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz : ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1.0; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
