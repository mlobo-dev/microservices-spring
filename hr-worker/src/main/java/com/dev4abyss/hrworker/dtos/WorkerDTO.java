package com.dev4abyss.hrworker.dtos;

import lombok.Data;

import javax.persistence.*;

@Data

public class WorkerDTO {


    private Long id;
    private String name;
    private Double dailyIncome;
}
