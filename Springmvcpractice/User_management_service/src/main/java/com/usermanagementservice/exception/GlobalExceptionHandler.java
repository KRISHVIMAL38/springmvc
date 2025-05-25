package com.usermanagementservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handle NullPointerException
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
        return new ResponseEntity<>("Null value encountered: " + ex.getMessage(), 
                                  HttpStatus.BAD_REQUEST);
    }

    // Handle IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ResponseEntity<>("Invalid argument provided: " + ex.getMessage(), 
                                  HttpStatus.BAD_REQUEST);
    }

    // Handle IllegalStateException
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<String> handleIllegalStateException(IllegalStateException ex) {
        return new ResponseEntity<>("Invalid operation state: " + ex.getMessage(), 
                                  HttpStatus.CONFLICT);
    }

    // Handle NumberFormatException
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException ex) {
        return new ResponseEntity<>("Invalid number format: " + ex.getMessage(), 
                                  HttpStatus.BAD_REQUEST);
    }

    // Handle ArrayIndexOutOfBoundsException
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<String> handleArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException ex) {
        return new ResponseEntity<>("Array index out of bounds: " + ex.getMessage(), 
                                  HttpStatus.BAD_REQUEST);
    }

    // Handle ClassCastException
    @ExceptionHandler(ClassCastException.class)
    public ResponseEntity<String> handleClassCastException(ClassCastException ex) {
        return new ResponseEntity<>("Type casting error: " + ex.getMessage(), 
                                  HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Handle ArithmeticException (like division by zero)
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
        return new ResponseEntity<>("Arithmetic error: " + ex.getMessage(), 
                                  HttpStatus.BAD_REQUEST);
    }

    // Handle UnsupportedOperationException
    @ExceptionHandler(UnsupportedOperationException.class)
    public ResponseEntity<String> handleUnsupportedOperationException(UnsupportedOperationException ex) {
        return new ResponseEntity<>("Operation not supported: " + ex.getMessage(), 
                                  HttpStatus.NOT_IMPLEMENTED);
    }

    // Handle SecurityException
    @ExceptionHandler(SecurityException.class)
    public ResponseEntity<String> handleSecurityException(SecurityException ex) {
        return new ResponseEntity<>("Security violation: Access denied", 
                                  HttpStatus.FORBIDDEN);
    }

    // Handle RuntimeException (parent of many runtime exceptions)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return new ResponseEntity<>("Runtime error occurred: " + ex.getMessage(), 
                                  HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Handle generic Exception (fallback for any unhandled exceptions)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return new ResponseEntity<>("Kuch Toh Phata hai: " + ex.getMessage(), 
                                  HttpStatus.INTERNAL_SERVER_ERROR);
    }
}