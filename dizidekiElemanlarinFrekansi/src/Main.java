import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {45, 56, 23, 12, 45, 56, 78, 89, 12, 23, 56};
        int[] frekans = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] > 1) {
                if (dizi[i] != 0) System.out.println(dizi[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}