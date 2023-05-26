package com.consume.consumingrest.controller;

import com.consume.consumingrest.feign.PaymentProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    private final PaymentProxy paymentProxy;

    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @GetMapping("/products")
    public ResponseEntity<List<?>> payments () {
        return paymentProxy.products();
    }
}
