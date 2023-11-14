package org.webapplication.springmvc.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("userID")
public class ToDoController {
    @Autowired
    private ToDoService service;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String listToDo( ModelMap model)
    {
        model.addAttribute("toDos",service.retrieveToDos(retrieveLoggedinUserName()));
        return "list-todos";
    }

    private String retrieveLoggedinUserName() {

        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails)
            return ((UserDetails) principal).getUsername();

        return principal.toString();
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddToDo(ModelMap model)
    {
        model.addAttribute("toDo", new ToDo());
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addToDo(ModelMap model, @Valid ToDo toDo, BindingResult result)
    {
        if(result.hasErrors()){
            return "todo";
        }
        model.clear();
        service.addToDo(retrieveLoggedinUserName(),toDo.getDesc(), toDo.getTargetDate(), false);
        return "redirect: list-todos";
    }


    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String deleteToDo(ModelMap model, @RequestParam int id)
    {
        model.clear();
        service.deleteToDo(id);
        return "redirect: list-todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateToDo(ModelMap model, @RequestParam int id)
    {
        model.clear();
        model.addAttribute("toDo",service.retrieveToDos(id));
        return "todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateToDo(ModelMap model, @Valid ToDo toDo, BindingResult result)
    {
        if(result.hasErrors()){
            return "todo";
        }
        toDo.setUser(retrieveLoggedinUserName());
        service.update(toDo);
        model.clear();
        return "redirect: list-todos";
    }
}
