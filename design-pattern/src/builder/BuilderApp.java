package builder;

public class BuilderApp {
    public static void main(String[] args) {
        Customer builder = new CustomerBuilder().setId(1).setName("Dest").setPhone("089").build();

        System.out.println(builder.toString());
    }
}
