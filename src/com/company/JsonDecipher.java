package com.company;

import java.util.Arrays;

public class JsonDecipher {
    private Task[] tasks;

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "JsonDecipher{" +
                "tasks=" + Arrays.toString(tasks) +
                '}';
    }
}
