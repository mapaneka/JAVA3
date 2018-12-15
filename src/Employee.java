import java.awt.*;
import java.util.Objects;

public class Employee {

    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }


    public static void main(String[] args) {

        Employee e1 = new Employee("Jan Kowalski", 32, 2345);
        Employee e2 = new Employee("Ewa Kowalska", 17, 1850);
        Employee e3 = new Employee("Jan Kowalski", 32, 2345);
        Menager m1 = new Menager("Jan Kowalski", 32, 2345, 600);
        //  Menager m10 = new Menager("Damian Majchrowski", 35, 1000, 100_000);

        for (int i = 0; i < 100_000; i++) {
            if (!e1.equals(e3)) {
                System.out.println("Coś poszło nie tak");
            }
        }


       /* if (e1.equals(m1)) {
            System.out.println("Ta sama osoba!!!");
        } else {
            System.out.println("Rozne osoby!");
        }*/
    }
}


class Menager extends Employee {
    int bonus;

    @Override
    public String toString() {
        return "Menager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Menager menager = (Menager) o;
        return bonus == menager.bonus;
    }


    public Menager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

}
