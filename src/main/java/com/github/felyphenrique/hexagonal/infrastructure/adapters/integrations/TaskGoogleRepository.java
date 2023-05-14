package com.github.felyphenrique.hexagonal.infrastructure.adapters.integrations;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.felyphenrique.hexagonal.domain.entities.Task;
import com.github.felyphenrique.hexagonal.domain.repositories.ITaskRepository;

/**
 * Exemplo de integração com Google Tasks.
 */
@Repository("integrations")
public class TaskGoogleRepository implements ITaskRepository {

    @Override
    public List<Task> all() {
        return Collections.emptyList();
    }

    @Override
    public Task find(long id) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(long id) {
        return;
    }
}
