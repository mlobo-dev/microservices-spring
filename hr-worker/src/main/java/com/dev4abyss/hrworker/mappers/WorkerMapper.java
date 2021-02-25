package com.dev4abyss.hrworker.mappers;

import com.dev4abyss.hrworker.dtos.WorkerDTO;
import com.dev4abyss.hrworker.entities.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WorkerMapper extends BaseMapper<Worker, WorkerDTO> {


}
