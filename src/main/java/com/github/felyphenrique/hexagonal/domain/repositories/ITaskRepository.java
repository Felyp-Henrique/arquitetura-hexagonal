package com.github.felyphenrique.hexagonal.domain.repositories;

import java.util.List;

import com.github.felyphenrique.hexagonal.domain.entities.Task;

public interface ITaskRepository {
    public List<Task> all();

    public Task find(long id);

    public Task create(Task task);

    public Task update(Task task);

    public void delete(long id);
}
