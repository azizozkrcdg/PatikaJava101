import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, password,kullaniciAdi,parola,yesOrNo,yeniParola;

        Scanner input = new Scanner(System.in);

        kullaniciAdi = "patikadev";
        parola = "java101";

        System.out.print("Kullanıcı Adı : ");
        userName = input.nextLine();
        System.out.print("Parola : ");
        password = input.nextLine();

        if((kullaniciAdi.equals(userName)) && (parola.equals(password))){
            System.out.print("Hoşgeldiniz " + kullaniciAdi);

        }else if((!kullaniciAdi.equals(userName)) && (parola.equals(password))) {
            System.out.print("Kullanıcı adını yanlış giriniz!");

        }else if((kullaniciAdi.equals(userName)) && (!parola.equals(password))){
            System.out.println("Parolanızı yanlış girdiniz !");
            System.out.print("Parolanızı değiştirmek ister misiniz? - y/n : ");
            yesOrNo = input.nextLine();

            if(yesOrNo.equals("y")){
                System.out.print("Yeni parolanızı giriniz : ");
                yeniParola = input.nextLine();

                if (yeniParola.equals("java101")){
                    System.out.print("Yeni parolanız ile eski parolanız aynı olamaz !");

                }else {
                    parola = yeniParola;
                    System.out.print("Parolanız başarılı bir şekilde değiştirildi.");
                }

            }else {
                System.out.print("Tekrar giriş yapınız !");
            }
        }else {
            System.out.println("Bilgilerinizi yanlış girdiniz !");
        }



    }
}
