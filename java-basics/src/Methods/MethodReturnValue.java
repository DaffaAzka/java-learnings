package Methods;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sayHello("Daffa", "Islami", "Azka"));
    }

    static String sayHello(String... names) {
        String say = "Hello";
        for (var name : names) {
            say += (" " + name);
        }
        return say;
    }
}
