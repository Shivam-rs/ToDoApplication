package org.webapplication.springmvc.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ToDoController {
    @Autowired
    ToDoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String login( ModelMap model)
    {
        model.addAttribute("toDos",service.retrieveToDo("Shivam"));
        return "list-todos";
    }
}
