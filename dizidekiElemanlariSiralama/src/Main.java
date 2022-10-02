import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size, temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Siralamak istediginiz array boyutunu giriniz : ");
        size = input.nextInt();

        if (size > 0) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("%d. elamanı giriniz : ", i + 1);
                arr[i] = input.nextInt();
            }

            System.out.println("Sıralanmamış dizi : " + Arrays.toString(arr));

            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Siralanmis dizi: " + Arrays.toString(arr));
        } else {
            System.out.print("Hatali giriş!");
            System.exit(0);
        }

    }
}