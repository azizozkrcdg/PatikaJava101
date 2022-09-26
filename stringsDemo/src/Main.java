public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); // Cümlenin kaç kelimeden oluştuğunu yazdırır.
        System.out.println("5. Eleman : " + mesaj.charAt(4)); // Girilen indexe cümlede karşılık gelen karakteri yazdırır.
        System.out.println(mesaj.concat("Yaşasın !")); // Cümlenin sonuna istenilen kelimeyi ekler.
        System.out.println(mesaj.startsWith("B")); // Cümlenin hangi karakter ile başladığını sorgular.
        System.out.println(mesaj.endsWith("l")); // Cümlenin hangi karakter ile bittiğini sorgular.

        char[] karakterler = new char[5]; // Karakter dizisi oluşturur
        mesaj.getChars(0, 5, karakterler, 0); // Başlangıç ve bitiş noktası girilen index numaraları arasında bulunan karakterleri yazdırır.
        System.out.println(karakterler); // Karakterler dizisini yazdırır.
        System.out.println(mesaj.indexOf("a")); // Girilen karakterin kaçıncı indexte bulunduğunu yazdırır.
        System.out.println(mesaj.lastIndexOf("a")); // Girilen karakterin sondan başlayarak kaçıncı indexte bulunduğunu yazdırır.
        System.out.println(mesaj.replace(" ", "-")); // Girilen karakteri istenilen başka bir karakterle değiştirir.
        System.out.println(mesaj.substring(2)); // Girilen indexten sonrasını yazdırır.
        System.out.println(mesaj.substring(2, 4)); // Girilen index aralığını yazdırır.
        // Her boşluktan sonra bir alt satıra geçer.
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // tüm karakterleri küçük harf yapar.
        System.out.println(mesaj.toUpperCase()); // TÜM KARAKTERLERİ BÜYÜK HARF YAPAR.
        System.out.println(mesaj.trim()); // Cümlenin başında ve sonunda ki boşlukları siler.
        
    }
}
