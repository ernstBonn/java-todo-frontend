package de.neuefische.backend.model;



public enum ToDoStatus {
    OPEN("todo"),
    IN_PROGRESS("doing"),
    DONE("done");

    private String description;
    ToDoStatus(String description){
        this.description = description;
    }
}
