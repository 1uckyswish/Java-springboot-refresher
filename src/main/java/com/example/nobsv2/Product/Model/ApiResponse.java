package com.example.nobsv2.Product.Model;

public class ApiResponse {
    private final String status;
    private final String error;
    private final String message;

    // Constructor
    public ApiResponse(String status, String error, String message) {
        this.status = status;
        this.error = error;
        this.message = message;
    }

    // Getters
    public String getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
