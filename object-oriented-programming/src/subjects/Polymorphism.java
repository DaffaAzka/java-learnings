package subjects;

import subjects.inheritance.Company;
import subjects.inheritance.Manager;

public class Polymorphism {
    public static void main(String[] args) {
        sayHello(new Company("Dest"));
        sayHello(new Manager("Sarah"));
    }

    public static void sayHello(Company e) {
        if (e instanceof Manager) {
            System.out.println("Good evening Manager. " + e.name + "!");
        } else if (e instanceof Company) {
            Company company = (Company) e;
            System.out.println("Good evening Boss. " + e.name + "!");
        }
        System.out.println("Good evening " + e.name + "!");
    }
}
