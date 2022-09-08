import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();


        // EBOB
        int ebob;



        if (n1 < n2){
            for (int i = n1; i >= 1; i--){
                if (n1%i==0 && n2%i==0){
                    ebob = i;
                    System.out.println("Ebob : " + ebob);
                    break;
                }
            }
        }else {
            for (int i = n2; i >= 1; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    System.out.println("Ebob : " + ebob);
                    break;
                }
            }
        }


    }
}
