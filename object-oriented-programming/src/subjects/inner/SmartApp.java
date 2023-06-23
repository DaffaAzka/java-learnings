package subjects.inner;

public class SmartApp {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Android");
        Smartphone.Brand brand = smartphone.new Brand("Oppo");

        System.out.println(brand.getOS());
    }
}
