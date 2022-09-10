

public class fibonecciSeries {
    public static void main(String[] args) {

        int n = 9;
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;

        for (int i =1 ; i < n ; i++){

            toplam = sayi1 + sayi2;
            System.out.println(sayi2 + " + " + sayi1 + " = " + toplam);
            sayi1 = sayi2;
            sayi2 = toplam;

        }

    }
}
