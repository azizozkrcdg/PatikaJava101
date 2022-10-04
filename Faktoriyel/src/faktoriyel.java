import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,totalN=1,totalR=1,nEksiR,totalNeksiR=1;
        double NRKombinasyon;

        System.out.print("N kümesinin eleman sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("R kümesinin eleman sayısını giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            totalN *= i;
        }

        for (int i = 1; i <= r; i++){
            totalR *= i;
        }

        nEksiR = n -r;

        for (int i = 1; i <= nEksiR; i++){
            totalNeksiR *= i;
        }

        NRKombinasyon = totalN / (totalR * totalNeksiR);

        if (n > r){
            System.out.println("N'in R'li kombinasyonu : " + NRKombinasyon);

        }else {
            System.out.print("R sayısı N sayısından büyük olamaz !");
        }


    }
}
