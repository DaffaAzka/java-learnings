package Methods;

public class MethodFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int value) {
        if (value == 1) {return 1;}
        return value * factorial(value - 1);
    }
}
