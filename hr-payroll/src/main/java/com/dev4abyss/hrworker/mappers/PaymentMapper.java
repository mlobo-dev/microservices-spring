package com.dev4abyss.hrworker.mappers;

import com.dev4abyss.hrworker.dtos.PaymentDTO;
import com.dev4abyss.hrworker.entities.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentMapper extends BaseMapper<Payment, PaymentDTO> {


}
