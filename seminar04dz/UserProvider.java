package seminar04dz;

public class UserProvider {
    private User[] allUsers;

    public UserProvider(User[] allUsers) {
        this.allUsers = allUsers;
    }

    public User getUserName(String name, User[] allUsers) {
        User user = allUsers[1];
        return user;
    }
}
