package org.todoapplication.jee;

public class LoginService {

    public boolean isUserValid(String user, String password) {
        if(user.equals("Shivam") && password.equals("LOL"))
             return true;

        return false;
    }
}
