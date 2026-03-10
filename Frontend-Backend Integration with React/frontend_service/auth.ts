package com.ecommerce.service;

import com.ecommerce.model.entity.Payment;
import com.ecommerce.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(Payment payment){
        return paymentRepository.save(payment);
    }
}