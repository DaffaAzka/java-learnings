package subjects;

import java.util.Random;

public class CRandom {
    public static void main(String[] args) {
        var random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(1000));
        }
    }
}
