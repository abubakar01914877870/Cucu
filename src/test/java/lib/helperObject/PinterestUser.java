package lib.helperObject;

public class PinterestUser {

    public String email;
    public String password;

    public PinterestUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public PinterestUser(String email) {
        this.email = email;
        this.password = "1234test";
    }
}
