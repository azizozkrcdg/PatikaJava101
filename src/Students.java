public class Students {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stundNo;
    String classes;
    double avarage;
    boolean isPass;

    Students(String name, String stundNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stundNo = stundNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }

    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage > 55){
            System.out.println("Sınıfı başarıyla geçtiniz !");
            this.isPass = true;
        }else {
            System.out.println("Sınıfı geçemediniz !");
            this.isPass = false;
        }
        System.out.println("Ortalamanız : " + this.avarage);
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println("===============");
    }
}
