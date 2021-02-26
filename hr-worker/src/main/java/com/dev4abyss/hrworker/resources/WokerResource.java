package com.dev4abyss.hrworker.resources;


import com.dev4abyss.hrworker.dtos.WorkerDTO;
import com.dev4abyss.hrworker.mappers.WorkerMapper;
import com.dev4abyss.hrworker.services.WorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Api(value = "Workers", tags = "Workers")
@RequestMapping("/workers")
@RequiredArgsConstructor
@RestController
public class WokerResource {

    private final WorkerService service;
    private final WorkerMapper mapper;
    private final Environment env;


    @Value("${test.config}")
    private String config;


    @ApiOperation("List all workers")
    @GetMapping
    public ResponseEntity<List<WorkerDTO>> listAll() {
        return ResponseEntity.ok(mapper.toDto(service.listAll()));
    }

    @ApiOperation("List all workers")
    @GetMapping("/configs")
    public ResponseEntity<String> configs() {
        log.info(config);
        return ResponseEntity.ok(config);
    }

    @ApiOperation("List worker by id")
    @GetMapping("/{id}")
    public ResponseEntity<WorkerDTO> findById(@PathVariable Long id) {

        log.info("PORT" + env.getProperty("local.server.port"));
        return ResponseEntity.ok(mapper.toDto(service.findById(id)));
    }
}



