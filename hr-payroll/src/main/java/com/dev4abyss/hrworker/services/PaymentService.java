package com.dev4abyss.hrworker.services;

import com.dev4abyss.hrworker.entities.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentService {


    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
