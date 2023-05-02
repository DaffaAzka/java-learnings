package Methods;

public class MethodVariableArgument {

    public static void main(String[] args) {
        System.out.println(plus(1,2,6,4,3,2,9));
    }
    static int plus(int... numbers) {
        int total = 0;
        for (var num : numbers) {
            total += num;
        }
        return total;
    }

}


