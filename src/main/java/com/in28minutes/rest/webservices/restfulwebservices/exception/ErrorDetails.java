package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    private LocalDateTime time;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime time, String message, String details) {
        this.time = time;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
