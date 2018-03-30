package divergentchange;

public class UserService {

    public static UserOD2 getUser(String username, String password) {
        if(isAuthorized(username,password)){
            return new UserOD2(username,password);
        }
        throw new UnauthorizedAccessException("Unauthorized access to StartNewOnDemandMachine method.");
    }

    private static boolean isAuthorized(String username, String password) {
        return username.equals("admin") && password.equals("passw0rd");
    }
}
