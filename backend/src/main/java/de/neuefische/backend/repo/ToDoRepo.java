package de.neuefische.backend.repo;

import de.neuefische.backend.model.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ToDoRepo {

    private Map<String, ToDo> toDoMap = new HashMap<>();

    public List<ToDo> listToDos() {
        return new ArrayList<>(toDoMap.values());
    }

    public ToDo addToDo(ToDo toDoToAdd) {
        toDoMap.put(toDoToAdd.getId(), toDoToAdd);
           return toDoToAdd;
    }

    public ToDo getToDo(String id) {
        return toDoMap.get(id);
    }

    public ToDo editToDo(ToDo toDoToEdit) {
       return toDoMap.replace(toDoToEdit.getId(), toDoToEdit);
    }
}
