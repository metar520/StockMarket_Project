package Domain;
public class User {
    private String encoded_password;
    private String username;
    private boolean loggedIn;
    private String email;

    public User(String username, String encoded_password, String email) {
        this.username = username;
        this.encoded_password = encoded_password;
        this.loggedIn = false;
        this.email = email;
    }

    public boolean isCurrUser(String username, String encoded_password) {
        if(this.username == username & this.encoded_password == encoded_password){
            return true;
        }
        return false;
    }

    public String getUserName(){
        return this.username;
    }

    public String getEncodedPassword(){
        return this.encoded_password;
    }

    public void logIn(){
        this.loggedIn = true;
    }

    public void logOut(){
        this.loggedIn = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
