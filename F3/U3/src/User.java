public class User {
    private final String name;
    private final String ePost;
    private String password;

    public User(String name, String ePost, String password) {
        this.name = name;
        this.ePost = ePost;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() { return name; }
    public String getEPost() { return ePost; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "Name: " + this.name + "E-post: " + this.ePost;
    }
}
