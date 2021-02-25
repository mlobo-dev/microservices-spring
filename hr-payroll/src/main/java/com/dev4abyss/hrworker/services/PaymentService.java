package com.dev4abyss.hrworker.services;

import com.dev4abyss.hrworker.entities.Payment;
import com.dev4abyss.hrworker.entities.Worker;
import com.dev4abyss.hrworker.feignClients.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentService {

    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);

    }
}
