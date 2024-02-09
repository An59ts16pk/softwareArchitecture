package seminar04dz;

public class User {
    private int id;
    private String name;
    private String info;

    public User(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
