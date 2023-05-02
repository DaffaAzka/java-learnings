package operations;

public class Mathematics {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        Augmented Assignments

        a += b;
        a -= b;
        a *= b;
        a /= b;
        System.out.println(a);

//        Unary Operators
        a++;
        b--;

    }
}
