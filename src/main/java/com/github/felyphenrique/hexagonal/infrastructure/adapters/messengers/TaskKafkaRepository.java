package com.github.felyphenrique.hexagonal.infrastructure.adapters.messengers;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.felyphenrique.hexagonal.domain.entities.Task;
import com.github.felyphenrique.hexagonal.domain.repositories.ITaskRepository;

/**
 * Exemplo de envio de TODOs por meio de um
 * mensageiro como Apache Kafka.
 */
@Repository("messengers")
public final class TaskKafkaRepository implements ITaskRepository {

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
