import subjects.Getter;
import subjects.Setter;
import subjects.abstracts.City;
import subjects.abstracts.Location;
import subjects.equals.Product;
import subjects.hidings.Child;
import subjects.hidings.Parent;
import subjects.inheritance.Company;
import subjects.inheritance.Manager;
import subjects.inheritance.supers.Rectangle;

public class App {
    public static void main(String[] args) {
        Product a = new Product("Iphone X", 15);
        Product b = new Product("Iphone X", 15);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    
}
