package subjects.anonymous;

public class AppLang {
    public static void main(String[] args) {
        Language french = new Language() {
            @Override
            public String name() {
                return "French";
            }

            @Override
            public String sayHello(String lang) {
                return "Bonjour!";
            }
        };

        System.out.println(french.sayHello("French"));
    }
}
