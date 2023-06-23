package subjects.records;

public class Login {

    public static void main(String[] args) {
        LoginRequest log = new LoginRequest("Dest", "Sarah", "Delta");
        log.addOne("Reicader");
        System.out.println(log.toString());
    }

}
