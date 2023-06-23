package subjects.exceptions;

import java.util.Objects;

public class ValidateApp {
    public static void main(String[] args) {
        try {
            sum("Dest", "");
        } catch (Throwable throwable) {
            StackTraceElement[] elements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }

    public static void sum(String a, String b) {
        if (Objects.equals(a, "") || Objects.equals(b, "")) {
            throw new ValidationException("Cannot be empty!");
        }
        System.out.println(a + " " + b);
    }
}
