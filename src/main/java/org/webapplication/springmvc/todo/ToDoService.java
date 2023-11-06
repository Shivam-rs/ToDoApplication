package org.webapplication.springmvc.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ToDoService {
    private static List<ToDo> toDos = new ArrayList<ToDo>();
    private static int toDoCount =3;

    static {
        toDos.add(new ToDo(1,"Shivam","Learn Spring MVC", new Date(),false));
        toDos.add(new ToDo(2,"Shivam","Learn Struts", new Date(),false));
        toDos.add(new ToDo(1,"Shivam","Learn Hibernate", new Date(),false));
    }

    public void addToDo(String name, String desc, Date targetDate, boolean isDone){
        toDos.add(new ToDo(++toDoCount, name, desc, targetDate, isDone));
    }

    public void deleteToDo(int id){
        toDos.removeIf(toDo -> toDo.getId() == id);
    }

    public ToDo retrieveToDo(String name){
        ToDo filterToDos = new ToDo();
        filterToDos = toDos.stream()
                .filter(f -> name.equals(f.getUser()))
                .findAny()
                .orElse(null);

        return filterToDos;
    }
}
