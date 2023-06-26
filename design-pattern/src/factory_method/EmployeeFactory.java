package factory_method;

public class EmployeeFactory {

    public static Employee manager(String s) {
        return new Employee(s, "Manager", 10);
    }

    public static Employee staff(String s) {
        return new Employee(s, "Staff", 5);
    }

}
