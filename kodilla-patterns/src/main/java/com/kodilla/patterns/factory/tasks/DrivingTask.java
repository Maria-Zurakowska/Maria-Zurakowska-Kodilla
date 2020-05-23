package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final private String taskName;
    final private String where;
    final private String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {

    }

    @Override
    public String getTaskName() {

        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {

        return true;
    }
}
