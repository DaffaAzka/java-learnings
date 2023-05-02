package statements;

public class SwitchLambdaS {
    public static void main(String[] args) {
        char data = 'A';

        switch (data) {
            case 'A' -> System.out.println("It's A");
            case 'B' -> System.out.println("It's B");
            default -> System.out.println("It's default");
        }
    }
}
