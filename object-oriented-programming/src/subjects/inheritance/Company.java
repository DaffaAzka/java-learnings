package subjects.inheritance;

public class Company {
    final public String name;
    public Company(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, My name is " + name + ", I'm a Boss");
    }
}

