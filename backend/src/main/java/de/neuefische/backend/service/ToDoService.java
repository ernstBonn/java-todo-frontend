package de.neuefische.backend.service;

import de.neuefische.backend.model.ToDo;
import de.neuefische.backend.repo.ToDoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ToDoService {

    private final ToDoRepo toDoRepo;
    private final RandomID randomId;

    public List<ToDo> listToDos() {
        return toDoRepo.listToDos();
    }

    public ToDo addToDo(ToDo toDoToAdd) {
        toDoToAdd.setId(randomId.generateId());
       return toDoRepo.addToDo(toDoToAdd);
    }

    public ToDo getToDo(String id) {
        return toDoRepo.getToDo(id);
    }

    public ToDo editToDo(ToDo toDoToEdit) {
        return toDoRepo.editToDo(toDoToEdit);
    }

    public ToDo deleteToDo(String id) {
        return toDoRepo.deleteToDo(id);
    }
}
