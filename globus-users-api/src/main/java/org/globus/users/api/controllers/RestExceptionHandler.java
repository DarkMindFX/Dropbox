package org.globus.users.api.controllers;

import org.globus.users.api.dto.ExceptionResponseDto;
import org.globus.users.api.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    protected ResponseEntity<Object> handleUserNotFoundExce(
            UserNotFoundException ex,
            WebRequest request) {

        ExceptionResponseDto exDto = new ExceptionResponseDto(new Date(),
                "User Not Found", ex.getMessage());

        return new ResponseEntity(exDto, HttpStatus.NOT_FOUND);
    }
}
