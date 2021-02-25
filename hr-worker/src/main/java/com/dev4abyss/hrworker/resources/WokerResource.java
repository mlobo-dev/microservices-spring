package com.dev4abyss.hrworker.resources;


import com.dev4abyss.hrworker.dtos.WorkerDTO;
import com.dev4abyss.hrworker.mappers.WorkerMapper;
import com.dev4abyss.hrworker.services.WorkerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Workers", tags = "Workers")
@RequestMapping("/workers")
@RequiredArgsConstructor
@RestController
public class WokerResource {

    private final WorkerService service;
    private final WorkerMapper mapper;


    @ApiOperation("List all workers")
    @GetMapping
    public ResponseEntity<List<WorkerDTO>> listAll() {
        return ResponseEntity.ok(mapper.toDto(service.listAll()));
    }
}



