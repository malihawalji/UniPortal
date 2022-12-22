package model;

import java.util.ArrayList;
import java.util.List;

public class LoginManager {

    private List<Login> logins;

    public LoginManager() {
        logins = new ArrayList<>();
    }

    public void addLogin(Login login) {
        logins.add(login);
    }

    public void removeLogin(Login login) {
        logins.remove(login);
    }
}
