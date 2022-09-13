public class palindromSayi {

    static String isPalindrom(int number){
     int temp = number, reverseNumber = 0, lastFigure;

     while (temp != 0){
         lastFigure = temp % 10;
         reverseNumber = (reverseNumber * 10) + lastFigure;
         temp /= 10;
     }

     if (number == reverseNumber){
         return number + " Palindrom Sayıdır.";
     }else {
         return number + " Palindrom Sayı Değildir.";
     }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(282));


    }
}
