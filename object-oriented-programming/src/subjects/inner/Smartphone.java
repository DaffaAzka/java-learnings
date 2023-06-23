package subjects.inner;

public class Smartphone {
    String OS;

    public Smartphone(String OS) {
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    class Brand {
        String brand;

        public Brand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public String getOS() {
            return Smartphone.this.getOS();
        }
    }
}
