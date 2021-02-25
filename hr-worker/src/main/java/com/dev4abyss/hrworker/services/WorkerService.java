package com.dev4abyss.hrworker.services;

import com.dev4abyss.hrworker.entities.Worker;
import com.dev4abyss.hrworker.exception.ObjectNotFoundException;
import com.dev4abyss.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkerService {

    private final WorkerRepository repository;

    public List<Worker> listAll() {
        return repository.findAll();
    }

    public Worker findById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException("Worker not found by id: " + id)
        );
    }
}
