package com.calculator.pythagoras.service;

import com.calculator.pythagoras.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Slf4j
@Service
public class CalculatorPythagorasService {

    public BigDecimal calculate(BigDecimal adjacentValue, BigDecimal oppositeValue) throws BusinessException {
        if(adjacentValue == null) {
            throw new BusinessException("Value of the adjacent catete is mandatory!");
        }
        if(oppositeValue == null) {
            throw new BusinessException("Value of the opposite catete is mandatory!");
        }
        Double powAdjacentValue = Math.pow(adjacentValue.doubleValue(), 2);
        Double powOppositeValue = Math.pow(oppositeValue.doubleValue(), 2);
        Double hypotenuseValue = Math.sqrt(powAdjacentValue + powOppositeValue);
        log.info("The value of the hypotenuse is" + hypotenuseValue);
        return BigDecimal.valueOf(hypotenuseValue).setScale(1, RoundingMode.UP);
    }
}
