package org.todoapplication.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.todoapplication.jee.LoginService;

@Controller
public class LoginController {
    @Autowired
    LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET )
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model)
    {
        if (!service.isUserValid(name,password)){
            model.put("errorMessage","Pls enter as valid credentials");
            return "login";
        }
        model.put("userID",name);
        return "welcome";
    }
}
