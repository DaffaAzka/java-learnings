package singleton;

public class DatabaseHelper {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
