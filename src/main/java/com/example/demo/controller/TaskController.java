package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {

   TaskService service;

    @GetMapping("/task/{id}")
    Task getById(@PathVariable Long id) {
       return service.getById(id);
    }
    
    @GetMapping("/task/all")
    List<Task> getAllPersons() {
        return service.getAllPersons();
    }

    @PostMapping("/task/save")
    Long saveNewPerson(@RequestBody Task task) {
        return service.saveTask(task);
    }
    
    @DeleteMapping("/task/delete/{id}")
    void deletePersonById(@PathVariable Long id) {
        service.deletePersonById(id);
    }

    @PutMapping("/task/update")
    Task updateSurnameById(@RequestBody Task task) {
        return service.updateById(task);
    }
}