package com.consume.consumingrest.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "payment", url = "${remote.server.url}")
public interface PaymentProxy {

    @GetMapping("/api")
    public ResponseEntity<List<?>> products();
}
