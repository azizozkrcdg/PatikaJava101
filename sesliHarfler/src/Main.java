import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sesli harf giriniz : ");
        String letter = input.nextLine();
        String thick = letter + " -> Kalın sesli harftir.";
        String thin = letter + " -> İnce sesli harftir.";

        switch (letter) {
            case "a":
            case "ı":
            case "o":
            case "u":
                System.out.println(thick);
                break;
            case "e":
            case "i":
            case "ö":
            case "ü":
                System.out.println(thin);
                break;
            default:
                System.out.println("Lütfen sesli bir harf giriniz !");
        }
    }
}
