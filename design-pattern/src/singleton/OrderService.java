package singleton;

import object_poll.DatabasePoll;

public class OrderService {
    public void save(String id) {
        Connection connection = DatabasePoll.getConnection();
        DatabasePoll.close(connection);
    }
}
