package com.dev4abyss.hrworker.repositories;

import com.dev4abyss.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
