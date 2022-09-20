public class Obs {
    public static void main(String[] args) {
        Teacher mahmut = new Teacher("Mahmut", 111, "TRH");
        Teacher kulYutmaz = new Teacher("Kül Yutmaz", 222,"FZK");
        Teacher murat = new Teacher("Murat", 303, "GRFK");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(mahmut);
        Course fizik = new Course("Fizik", "202", "FZK");
        fizik.addTeacher(kulYutmaz);
        Course grafik = new Course("Grafik","303","GRFK");
        grafik.addTeacher(murat);

        Students s1 = new Students("İnek Şaban", "123", "4", tarih, fizik, grafik);
        System.out.println(s1.name + " :");
        s1.addBulkExamNote(100,90,85);
        s1.isPass();

        Students s2 = new Students("Güdük Necmi", "124", "4", tarih, fizik, grafik);
        System.out.println(s2.name + " :");
        s2.addBulkExamNote(60,95,60);
        s2.isPass();


    }

}
