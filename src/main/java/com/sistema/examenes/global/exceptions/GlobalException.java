package com.sistema.examenes.global.exceptions;

import com.sistema.examenes.global.dto.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<MessageDto> throwNotFoundException(ResourceNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new MessageDto(HttpStatus.NOT_FOUND, e.getMessage()));
    }
    @ExceptionHandler(AttributeException.class)
    public ResponseEntity<MessageDto> throwNotFoundException(AttributeException e){
        return ResponseEntity.badRequest()
                .body(new MessageDto(HttpStatus.BAD_REQUEST, e.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MessageDto> generalException(Exception e){
        return ResponseEntity.internalServerError()
                .body(new MessageDto(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
    }
}