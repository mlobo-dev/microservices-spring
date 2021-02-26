package com.dev4abyss.hrworker.resources;


import com.dev4abyss.hrworker.dtos.PaymentDTO;
import com.dev4abyss.hrworker.entities.Payment;
import com.dev4abyss.hrworker.mappers.PaymentMapper;
import com.dev4abyss.hrworker.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Payment", tags = "Payment")
@RequestMapping("/payments")
@RequiredArgsConstructor
@RestController
public class PaymentResource {

    private final PaymentService service;
    private final PaymentMapper mapper;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<PaymentDTO> getPayment(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days) {
        return ResponseEntity.ok(mapper.toDto(service.getPayment(workerId, days)));
    }

    public ResponseEntity<PaymentDTO> getPaymentAlternative(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days) {

        return ResponseEntity.ok(mapper.toDto(new Payment("Brann", 400.0, days)));
    }
}



