package com.project2.springboot.tutorial.error;

import com.project2.springboot.tutorial.entity.errorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class restResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(departmentNotFoundException.class)
    public ResponseEntity<errorMessage> departmentNotFoundExceptionHandler(departmentNotFoundException exception, WebRequest request)
    {
        errorMessage message = new errorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

}
