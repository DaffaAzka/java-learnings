package object_poll;

import singleton.Connection;

import java.util.ArrayList;
import java.util.List;

public class DatabasePoll {

    private static List<Connection> poll = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            Connection connection = new Connection();
            poll.add(connection);
        }
    }

    public static Connection getConnection() {
        if (poll.isEmpty()) {
            throw new RuntimeException();
        }
        Connection connection = poll.remove(0);
        return connection;
    }

    public static void close(Connection connection) {
        poll.add(connection);
    }
}
