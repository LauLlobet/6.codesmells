package divergentchange;

public class UserOD2 {
    private final String password;
    private final String username;

    public UserOD2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}