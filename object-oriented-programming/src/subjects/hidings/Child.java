package subjects.hidings;

public class Child extends Parent {
    public String name;
    @Override
    public void doIt() {
        System.out.println("Do it from child!");
    }
}
