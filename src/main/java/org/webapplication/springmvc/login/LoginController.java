package org.webapplication.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userID")
public class LoginController {
/*    @Autowired
    LoginService service;*/

    @RequestMapping(value = "/welcome", method = RequestMethod.GET )
    //@ResponseBody
    public String login(ModelMap model){
        model.put("userID","Shivam");
        return "welcome";
    }

/*    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model)
    {
        if (!service.isUserValid(name,password)){
            model.put("errorMessage","Pls enter as valid credentials");
            return "login";
        }
        model.put("userID",name);
        return "welcome";
    }*/
}
