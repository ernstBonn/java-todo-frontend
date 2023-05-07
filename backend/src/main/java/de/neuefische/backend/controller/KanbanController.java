package de.neuefische.backend.controller;

import de.neuefische.backend.model.ToDo;
import de.neuefische.backend.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KanbanController {

    private final ToDoService toDoService;

    @GetMapping("/todo")
    public List<ToDo> listToDos(){
        return toDoService.listToDos();
    }

    @PostMapping("/todo")
    public ToDo addToDo(@RequestBody ToDo toDoToAdd){
        return toDoService.addToDo(toDoToAdd);
    }

    @GetMapping("/todo/{id}")
    public ToDo getToDo(@PathVariable String id){
        return toDoService.getToDo(id);
    }

    @PutMapping("todo/{id}")
    public ToDo editToDo(@RequestBody ToDo toDoToEdit){
        return toDoService.editToDo(toDoToEdit);
    }

    @DeleteMapping("todo/{id}")
    public ToDo deleteToDo (@PathVariable String id){
        return toDoService.deleteToDo(id);
    }
}
