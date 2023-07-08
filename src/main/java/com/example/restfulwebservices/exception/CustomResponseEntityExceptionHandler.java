package com.example.restfulwebservices.exception;

import com.example.restfulwebservices.user.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity handleAllException(Exception ex, WebRequest wr) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), wr.getDescription(false));
        ResponseEntity exceptionResponseResponseEntity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        return exceptionResponseResponseEntity;
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity handleUserNotFoundException(UserNotFoundException ex, WebRequest wr) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), wr.getDescription(false));
        ResponseEntity exceptionResponseResponseEntity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return exceptionResponseResponseEntity;
    }
}
