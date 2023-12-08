package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BaseException {
    private HttpStatus status;
    private Object message;

    public BaseException(HttpStatus status, Object message) {
        this.status = status;
        this.message = message;
    }
}
