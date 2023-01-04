package com.calculator.pythagoras.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessException extends Exception{
    private String businessMessage;
}

