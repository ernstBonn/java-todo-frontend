package de.neuefische.backend.service;

import de.neuefische.backend.model.ToDo;
import de.neuefische.backend.repo.ToDoRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.neuefische.backend.model.ToDoStatus.OPEN;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ToDoServiceTest {

ToDoRepo toDoRepo = mock(ToDoRepo.class);
RandomID randomID = mock(RandomID.class);
ToDoService toDoService = new ToDoService(toDoRepo, randomID);

@Test
    void testListToDos_shouldReturnAnEmptyList(){
    //given
    Map<String, ToDo> givenMap = new HashMap<>();
    List<ToDo> expected = new ArrayList<>();
    //when
    when(toDoRepo.listToDos()).thenReturn(new ArrayList<>(givenMap.values()));
    List result = toDoService.listToDos();
    //then
    assertEquals(expected, result);
    verify(toDoRepo).listToDos();
}
@Test
    void testListToDos_shouldReturnOneToDo(){
    //given
    ToDo toDo = new ToDo("123", "someToDo", OPEN);
    List<ToDo> expected = List.of(toDo);
    //when
    when(toDoRepo.listToDos()).thenReturn(expected);
    List result = toDoService.listToDos();
    //then
    assertEquals(expected, result);
    verify(toDoRepo).listToDos();
}

}