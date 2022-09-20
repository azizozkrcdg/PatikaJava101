public class Teacher {
    String name;
    int mobilNumber;
    String branch;

    Teacher(String name, int mobilNumber, String branch){
        this.name = name;
        this.mobilNumber = mobilNumber;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mobilNumber);
        System.out.println("Branş : " + this.branch);
    }


}
