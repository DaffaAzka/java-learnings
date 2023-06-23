package subjects.inheritance;

public class Manager extends Company {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, My name is " + name + ", I'm a Manager");
    }
}
