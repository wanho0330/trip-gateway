package com.trip.common.exception;

import com.trip.common.dto.ErrorRes;
import io.jsonwebtoken.JwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(JwtException.class)
    public ResponseEntity<ErrorRes> handleJwtException(JwtException e) {
        ErrorRes res = ErrorRes.builder()
                .message(e.getMessage())
                .status(HttpStatus.UNAUTHORIZED)
                .build();

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(res);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorRes> handleIllegalArgumentException(IllegalArgumentException e) {
        ErrorRes res = ErrorRes.builder()
                .message(e.getMessage())
                .status(HttpStatus.BAD_REQUEST)
                .build();

        return ResponseEntity.badRequest().body(res);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorRes> handleGenericException(Exception e) {
        ErrorRes res = ErrorRes.builder()
                .message(e.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(res);
    }



}
