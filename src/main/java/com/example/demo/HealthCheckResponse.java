package com.example.demo;

public class HealthCheckResponse {
    private String result;
    private boolean error;

    public HealthCheckResponse(String status, boolean error) {
        this.result = status;
        this.error = error;
    }

    public String getResult() {
        return result;
    }

    public boolean getError() {
        return error;
    }
}
