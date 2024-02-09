package seminar04dz;

public class UserRepository implements UserRepo {
    private User[] baseList;

    @Override
    public User read(int n) {
        User user = baseList[n];
        return user;
    }

    @Override
    public User[] readAll() {
        return baseList;
    }

}
