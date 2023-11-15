package org.webapplication.springmvc.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {
    private static List<ToDo> toDos = new ArrayList<>();
    private static int toDoCount =3;

    static {
        toDos.add(new ToDo(1,"Shivam","Learn Spring MVC", new Date(),false));
        toDos.add(new ToDo(2,"Shivam","Learn Struts", new Date(),false));
        toDos.add(new ToDo(3,"Shivam","Learn Hibernate", new Date(),false));
    }

    public void addToDo(String name, String desc, Date targetDate, boolean isDone){
        toDos.add(new ToDo(++toDoCount, name, desc, targetDate, isDone));
    }

    public void deleteToDo(int id){
        toDos.removeIf(toDo -> toDo.getId() == id);
    }

    public List<ToDo> retrieveToDos(String name){
        List<ToDo> filterToDos = new ArrayList<ToDo>();
        filterToDos = toDos.stream()
                .filter(user -> name.equals(user.getUser()))
                .collect(Collectors.toList());

        return filterToDos;
    }

    public ToDo retrieveToDos(int id){
        List<ToDo> lol = new ArrayList<ToDo>();
        ToDo a = new ToDo();
       lol = toDos.stream()
                .filter(user -> id == user.getId())
                .collect(Collectors.toList());
        return lol.get(0);

    }

    public void update(ToDo toDo){
        ToDo updatedTodo = retrieveToDos(toDo.getId());
        updatedTodo.setUser(toDo.getUser());
        updatedTodo.setDesc(toDo.getDesc());
        updatedTodo.setTargetDate(toDo.getTargetDate());
        updatedTodo.setDone(toDo.getDone());
        /*ToDo updateToDo = new ToDo(toDo.getId(),toDo.getUser(),toDo.getDesc(), toDo.getTargetDate(),toDo.getDone());
        toDos.remove(toDo);
        toDos.add(updateToDo);*/

    }
}