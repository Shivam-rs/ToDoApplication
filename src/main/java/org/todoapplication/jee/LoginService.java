package org.todoapplication.jee;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean isUserValid(String user, String password) {
        if(user.equals("Shivam") && password.equals("LOL"))
             return true;

        return false;
    }
}
