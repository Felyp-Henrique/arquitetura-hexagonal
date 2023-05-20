package com.github.felyphenrique.hexagonal.application.tasks.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.felyphenrique.hexagonal.application.core.controllers.IController;
import com.github.felyphenrique.hexagonal.domain.entities.Task;
import com.github.felyphenrique.hexagonal.domain.services.TaskService;

@RestController
@RequestMapping("/${app.version}/tasks")
public class TaskController implements IController<Task, String> {

    @Autowired
    private TaskService service;

    @Override
    public ResponseEntity<List<Task>> index() {
        return ResponseEntity.ok().body(Collections.emptyList());
    }

    @Override
    public ResponseEntity<Task> show(String id) {
        return ResponseEntity.ok().body(new Task());
    }

    @Override
    public ResponseEntity<Task> create(Task entity) {
        return ResponseEntity.ok().body(new Task());
    }

    @Override
    public ResponseEntity<Task> update(String id, Task entity) {
        return ResponseEntity.ok().body(new Task());
    }

    @Override
    public ResponseEntity<Void> delete(String id) {
        return ResponseEntity.ok().build();
    }
}
