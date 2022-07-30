package OOP.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {

        if (2021 - this.hireYear <= 9) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear <= 19) {
            return this.salary * 0.10;
        } else if (2021 - this.hireYear > 19) {
            return this.salary * 0.15;
        }
        return this.salary;
    }

    public void myToString() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam Maaş: " + (this.salary + this.raiseSalary()));
    }
}
