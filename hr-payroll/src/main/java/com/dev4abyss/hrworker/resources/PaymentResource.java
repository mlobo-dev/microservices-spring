package com.dev4abyss.hrworker.resources;


import com.dev4abyss.hrworker.dtos.PaymentDTO;
import com.dev4abyss.hrworker.mappers.PaymentMapper;
import com.dev4abyss.hrworker.services.PaymentService;
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


    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<PaymentDTO> hello(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days) {
        return ResponseEntity.ok(mapper.toDto(service.getPayment(workerId, days)));
    }
}



