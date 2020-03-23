package com.kodilla.stream.portfolio;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


import org.junit.Test;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {
    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");

        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);

        TaskList taskListInProgress = new TaskList("In progress");

        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);

        TaskList taskListDone = new TaskList("Done");

        taskListDone.addTask(task6);

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

//ta metoda jest typu Board, więc ma zwrócić zmienną typu Board, tu. project
        return project;
    }

    @Test
    public void testAddTaskList(){
        //Given
        Board project = prepareTestData();

        //When

        //Then
// Sprawdza, czy w tablicy project typu Board zostały zdefiniowane 3 listy zadań
        Assert.assertEquals(3,project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks(){
        //Given
        Board project = prepareTestData();

        //When
        User user = new User("developer1", "John Smith");
//uruchamiam strumień kolekcji .getTaskLists() obiektu Board (project)
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());

        //Then
// sprawdzamy, czy znaleziono 2 zadania
        Assert.assertEquals(2,tasks.size());
// dlaczego 0 i 1? Sprawdzamy czy w dwóch zadaniach (0,1) jest przypisany developer1
        Assert.assertEquals(user,tasks.get(0).getAssignedUser());
        Assert.assertEquals(user,tasks.get(1).getAssignedUser());
    }
    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));

        List<Task> tasks = project.getTaskLists().stream()// uruchamiam strumień na kolekcji getTaskLists() klasy Board
                .filter(undoneTasks::contains) //filtruję tylko te zadania, które są niewykonane
                .flatMap(tl ->tl.getTasks().stream()) // do strumienia trafiają konkretne zadania z list zadań
                .filter(t -> t.getDeadline().isBefore(LocalDate.now())) //czy data każdego zadania nie jest wcześniejsza niż bieżąca data LocalDate.now()
                .collect(toList()); //terminal
        //Then
// czy znaleziono 1 przeterminowane zadanie
        Assert.assertEquals(1,tasks.size());
//czy znalezione zadanie jest tym przeterminowanym zadaniem
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    public void testAddTaskListFindLongTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress")); //tworzę listę zawierającą listę zadań w realizacji

        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)

                .flatMap(tl -> tl.getTasks().stream())// z listy zadań przechodzimy na konkretne zadania
                .map(t -> t.getCreated())//.getCreated() metoda klasy Task , private final LocalDate created;

//.compareTo() metoda klasy LocalDate
//do strumienia trafiają daty, które są starsze lub równa niż 10 dni przed
//bieżącą datą
                .filter(d->d.compareTo(LocalDate.now().minusDays(10))<=0)
                .count();
        //Then
// czy znaleziono dokładnie dwa takie zadania
        Assert.assertEquals(2,longTasks);
    }
    @Test
    public void testAddTaskListAverageWorkingOnTask(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> taskListInProgress = new ArrayList<>();
        taskListInProgress.add(new TaskList("In progress task 1"));

//ile dni upłynęło od daty utworzenia do daty bieżącej

        double numberOfDays = project.getTaskLists().stream()
                        .filter(taskListInProgress::contains)
                        .flatMap(n->n.getTasks().stream())
                        .map(t -> t.getCreated())
                        .mapToLong(d->ChronoUnit.DAYS.between(d,LocalDate.now()))
                        .average().getAsDouble();

        //Then
        Assert.assertEquals(10,numberOfDays,0.001);
    }
}
