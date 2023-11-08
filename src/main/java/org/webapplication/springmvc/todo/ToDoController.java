package org.webapplication.springmvc.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("userID")
public class ToDoController {
    @Autowired
    ToDoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String listToDo( ModelMap model)
    {
        model.addAttribute("toDos",service.retrieveToDo("Shivam"));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showToDo()
    {
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addToDo(ModelMap model, @RequestParam String desc)
    {
        model.clear();
       // model.addAttribute("toDos",service.retrieveToDo("Shivam"));
        service.addToDo("Shivam",desc, new Date(), false);
        return "redirect: list-todos";
    }


    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteToDo(ModelMap model, @RequestParam int id)
    {
        model.clear();
        service.deleteToDo(id);
        return "redirect: list-todos";
    }

}
