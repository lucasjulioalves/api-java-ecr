package com.example.demo.controller;


import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task/v1")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("update")
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @GetMapping("getAll")
    public List<Task> getAll() {
        return taskService.listAllTasks();
    }

    @GetMapping("healthCheck")
    public String healthCheck() {
        return "";
    }

    @DeleteMapping("delete")
    public Task deleteTask(@RequestBody Task task) {
        taskService.deleteTask(task);
        return task;
    }
}
