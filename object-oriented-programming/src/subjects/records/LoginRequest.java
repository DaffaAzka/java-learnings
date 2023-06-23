package subjects.records;

import java.util.Arrays;

public record LoginRequest(String... usernames) {
    public void addOne(String temp) {
        usernames[1] = temp;
    }

    @Override
    public String toString() {
        var data = "";
        for (var temp : usernames) {
            data += (temp + " ");
        }
        return "LoginRequest{" +
                "usernames=" + data +
                '}';
    }
}
