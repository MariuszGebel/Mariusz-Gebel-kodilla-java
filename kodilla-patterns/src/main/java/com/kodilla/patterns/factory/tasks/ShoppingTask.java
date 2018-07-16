package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    private boolean executed;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(){
        executed = true;
        return "Task name: " + taskName + " | What to buy: " + whatToBuy + " | Quantity: " + quantity;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
