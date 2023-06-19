package com.demo.example.SpringBootUIDemo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.demo.example.SpringBootUIDemo.Model.Task;

public interface ITaskService {

    List <Task> getTasksByUser(String user);

    Optional <Task> getTaskById(long id);

    void updateTask(Task task);

    void addTask(String name, String desc, Date targetDate, boolean isDone);

    void deleteTask(long id);

    void saveTask(Task task);
}
