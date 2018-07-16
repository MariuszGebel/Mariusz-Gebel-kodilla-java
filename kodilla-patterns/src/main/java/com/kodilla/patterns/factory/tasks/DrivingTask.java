package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    private boolean executed;

    public DrivingTask(final String taskName, final String where, final String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask(){
        executed = true;
        return "Task name: " + taskName + " | Where: " + where + " | Using: " + using;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return executed;
    }

}
