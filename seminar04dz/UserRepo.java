package seminar04dz;

public interface UserRepo {
    User read(int n);

    User[] readAll();
}
