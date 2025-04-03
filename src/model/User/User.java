package model;

public class User {
    private final String username;
    private final boolean loggedIn;

    public User(String username, boolean loggedIn) {
        this.username = username;
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return username;
    }
}

