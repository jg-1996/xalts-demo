package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.HealthComponent;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @Autowired
    private HealthEndpoint healthEndpoint;

    @GetMapping
    public HealthCheckResponse healthCheck() {
        HealthComponent defaultHealth = healthEndpoint.health();

        if(defaultHealth.getStatus().equals(Status.UP)) {
            return new HealthCheckResponse("Healthy", false);
        }
        return new HealthCheckResponse(defaultHealth.getStatus().getCode(), true);
    }
}