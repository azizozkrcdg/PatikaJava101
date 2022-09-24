public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double vergi = this.salary*0.03;
        if (this.salary < 1000) {
            return 0;
        } else {
            return vergi;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            int bonus = (this.workHours - 40) * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int calisilanYil = 2021 - this.hireYear;
        double zam;
        if (calisilanYil > 0 && calisilanYil < 10) {
            zam = this.salary * 0.05;
            return zam;
        } else if (calisilanYil > 9 && calisilanYil < 20) {
            zam = this.salary * 0.1;
            return zam;
        } else if (calisilanYil > 19) {
            zam = this.salary * 0.15;
            return zam;
        }else {
            return 0;
        }
    }

    public void toString1(){
        double toplam = salary + raiseSalary() + bonus() - tax();
        double top = salary + bonus() - tax();
        System.out.println("Adı Soyadı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + top);
        System.out.println("Toplam Maaş : " + toplam);

    }


}
