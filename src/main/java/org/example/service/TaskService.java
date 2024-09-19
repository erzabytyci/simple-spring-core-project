package org.example.service;

import org.example.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    //managing tasks in a simple list for now
    private final List<Task> tasks = new ArrayList<>();

    //method for adding tasks
    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    //method for retrieving all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    //marking a task as complete
    public void completeTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
        }
    }
}
