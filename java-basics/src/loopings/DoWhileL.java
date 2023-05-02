package loopings;

public class DoWhileL {
    public static void main(String[] args) {
        int i = 1000;
        do {
            System.out.println("Loop-" + (i + 1));
            i++;
        } while (i < 10);
    }
}
