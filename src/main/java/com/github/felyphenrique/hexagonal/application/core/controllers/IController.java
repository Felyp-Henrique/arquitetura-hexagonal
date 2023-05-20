package com.github.felyphenrique.hexagonal.application.core.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<E, P> {

    @GetMapping()
    public ResponseEntity<List<E>> index();

    @GetMapping("/{id}")
    public ResponseEntity<E> show(@PathVariable P id);

    @PostMapping()
    public ResponseEntity<E> create(@RequestBody E entity);

    @PutMapping("/{id}")
    public ResponseEntity<E> update(@PathVariable P id, @RequestBody E entity);

    @DeleteMapping()
    public ResponseEntity<Void> delete(@PathVariable P id);
}
