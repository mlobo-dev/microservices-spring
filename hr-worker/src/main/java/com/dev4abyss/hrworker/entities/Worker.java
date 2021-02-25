package com.dev4abyss.hrworker.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_WORKER")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_WORKER")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DAILY_INCOME")
    private Double dailyIncome;
}
