package com.springdemo.payroll;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id){
        super(String.format("should not find order %d", id) );
    }
}
