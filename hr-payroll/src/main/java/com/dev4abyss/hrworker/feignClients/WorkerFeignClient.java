package com.dev4abyss.hrworker.feignClients;

import com.dev4abyss.hrworker.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "${api.worker.url}", path = "/workers")
public interface WorkerFeignClient {


    @GetMapping("/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
