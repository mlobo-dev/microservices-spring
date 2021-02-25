package com.dev4abyss.hrworker.services;

import com.dev4abyss.hrworker.entities.Worker;
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

}
