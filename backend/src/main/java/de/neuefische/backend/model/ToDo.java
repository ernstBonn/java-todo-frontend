package de.neuefische.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.EnumMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {

    private String id;
    private String description;
    private ToDoStatus status;

}
