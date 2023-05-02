package statements;

public class SwitchS {
    public static void main(String[] args) {
        char data = 'A';

        switch (data) {
            case 'A':
                System.out.println("It's A");
                break;

            case 'B':
                System.out.println("It's B");
                break;

            default:
                System.out.println("It's default");
        }

        //        Using yield

        String justSay = switch (data) {
            case 'A':
                yield "Good";
            case 'B':
                yield "Amazing";
            default:
                yield "Not enough";
        };
    }
}
