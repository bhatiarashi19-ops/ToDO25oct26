package com.rashi.ToDo;

public class Task {
    private int id; // Make sure this is an 'int' or 'Integer' (not lnteger)
    private String task;

    public Task() {}

    public Task(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTask() { return task; }
    public void setTask(String task) { this.task = task; }
}
