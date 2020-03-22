package com.kodilla.stream.portfolio;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class TaskList {
    private final List<Task> tasks = new ArrayList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }
    public void addTask(Task task){
        tasks.add(task); //dodaj do listy TASK
    }
    public boolean removeTask(Task task){
        return tasks.remove(task);
    }
// Getter zwraca listę zadań i List<Task>
//  tworzy nową listę używając konstruktora kopiującego

    public List<Task> getTasks(){
        return new LinkedList<>(tasks);
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;

        TaskList taskList = (TaskList) o;

        if (!getTasks().equals(taskList.getTasks())) return false;
        return getName().equals(taskList.getName());
    }


}
