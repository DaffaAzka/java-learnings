package factory_method;

public class FactoryApp {
    public static void main(String[] args) {
        Employee manager = EmployeeFactory.manager("Dest");
    }
}
