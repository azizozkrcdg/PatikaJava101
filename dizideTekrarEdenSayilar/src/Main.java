import java.util.Arrays;

public class Main {


    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {2, 5, 6, 1, 2, 4, 6, 4, 6, 6, 2, 8, 8};
        int[] ciftsayi = new int[list.length];
        int baslangic = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(ciftsayi, list[i])) {
                        ciftsayi[baslangic++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value : ciftsayi) {
            if ((value != 0) && (value % 2 != 1)) {
                System.out.println(value);
            }
        }
    }
}