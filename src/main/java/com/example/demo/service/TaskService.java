package com.example.demo.service;

import com.example.demo.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Task task);
    List<Task> listAllTasks();

}

