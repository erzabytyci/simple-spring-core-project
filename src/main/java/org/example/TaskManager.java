package org.example;

import org.example.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskManager implements CommandLineRunner {

    private final TaskService taskService;

    @Autowired
    public TaskManager(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... args) {

        taskService.addTask("Learn Spring Core");
        taskService.addTask("Build a Spring Project");

        System.out.println("All tasks:");
        taskService.getAllTasks().forEach(System.out::println);

        System.out.println("\nMarking first task as complete...");
        taskService.completeTask(0);

        System.out.println("\nAll tasks after completion:");
        taskService.getAllTasks().forEach(System.out::println);
    }
}
