package subjects.reflections;

public class CreateUserRequest {

    public CreateUserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @NotBlank
    String username;

    @NotBlank
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

