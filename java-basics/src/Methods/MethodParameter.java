package Methods;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Daffa", "Islami", "Azka");
    }

    static void sayHello(String... names) {
        System.out.print("Hello ");
        for (var name : names) {
            System.out.print(name + " ");
        }
    }
}
