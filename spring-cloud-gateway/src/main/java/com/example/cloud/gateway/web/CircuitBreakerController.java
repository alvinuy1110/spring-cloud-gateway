package com.example.cloud.gateway.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
@RestController
public class CircuitBreakerController {

    @GetMapping("/fallback")
    Flux<String> getFallback() {
        return Flux.just("fallback for circuit breaker"); // or return cache of sampah's list
    }

}
