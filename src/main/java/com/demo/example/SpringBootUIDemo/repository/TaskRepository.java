package com.demo.example.SpringBootUIDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.SpringBootUIDemo.Model.Task;

public interface TaskRepository extends JpaRepository <Task, Long > {
    List <Task> findByUserName(String user);
}
