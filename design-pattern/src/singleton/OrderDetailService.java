package singleton;

import object_poll.DatabasePoll;

public class OrderDetailService {
    public void save(String id, String product) {
        Connection connection = DatabasePoll.getConnection();
        DatabasePoll.close(connection);
    }
}
