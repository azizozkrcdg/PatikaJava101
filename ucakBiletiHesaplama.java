import java.util.Scanner;
public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        double perKm = 0.10, tutar, cocukTutar, gencTutar, yasliTutar, cocukTutarTip2, gencTutarTip2, yasliTutarTip2, tutarTip2;
        int mesafe, yonSecim, yas;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (1- Tek Yön / 2- Çift Yön) : ");
        yonSecim = input.nextInt();

        tutar = mesafe * perKm;
        cocukTutar = tutar - ((mesafe * perKm)*0.50);
        gencTutar = tutar -((mesafe * perKm)*0.10);
        yasliTutar = tutar - ((mesafe * perKm)*0.30);
        
        tutarTip2 = tutar - (tutar*0.20);
        cocukTutarTip2 = cocukTutar - (cocukTutar*0.20);
        gencTutarTip2 = gencTutar - (gencTutar*0.20);
        yasliTutarTip2 = yasliTutar - (yasliTutar*0.20);
        
        

        if ( yas > 0 && mesafe > 0){

            if(yas < 12){
                switch (yonSecim){
                    case 1:
                        System.out.println("Tutar : " + cocukTutar);
                        break;
                    case 2:
                        System.out.println("Tutar : " + cocukTutarTip2 );
                    default:
                        isError = true;
                }
            } else if (yas >= 12 && yas <=24 ){
                switch (yonSecim){
                    case 1:
                        System.out.println("Tutar : " + gencTutar);
                        break;
                    case 2:
                        System.out.println("Tutar : " + gencTutarTip2);
                        break;
                    default:
                        isError = true;
                }
            }else if (yas > 65 ) {
                switch (yonSecim) {
                    case 1:
                        System.out.println("Tutar : " + yasliTutar);
                        break;
                    case 2:
                        System.out.println("Tutar : " + yasliTutarTip2);
                        break;
                    default:
                        isError = true;
                }
            }else {
                switch (yonSecim){
                    case 1:
                        System.out.println("Tutar : " + tutar);
                        break;
                    case 2:
                        System.out.println("Tutar : " + tutarTip2);
                        break;
                    default:
                        isError = true;
                }
            }

        }else {
            isError = true;
        }

        if(isError){
            System.out.println("Lütfen geçerli bir değer giriniz !");
        }










    }
}
