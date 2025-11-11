public class Account {

    private String username;
    private String password;
    private String date;

    public Account(String username, String password, String date) {
        this.username = username;
        this.password = password;
        this.date = date;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDate() {
        return date;
    }
}
