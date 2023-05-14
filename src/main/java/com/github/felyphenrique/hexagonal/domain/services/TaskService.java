package com.github.felyphenrique.hexagonal.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.felyphenrique.hexagonal.domain.entities.Task;
import com.github.felyphenrique.hexagonal.domain.repositories.ITaskRepository;

@Service
public class TaskService {

    @Autowired
    @Qualifier("database")
    private ITaskRepository repository;

    public List<Task> all() {
        return this.repository.all();
    }

    public Task find(long id) {
        return this.repository.find(id);
    }

    public Task create(Task task) {
        return this.repository.create(task);
    }

    public Task update(Task task) {
        return this.repository.update(task);
    }

    public void delete(long id) {
        this.repository.delete(id);
    }
}
