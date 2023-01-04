package com.calculator.pythagoras.controller;

import com.calculator.pythagoras.exception.BusinessException;
import com.calculator.pythagoras.service.CalculatorPythagorasService;
import com.calculator_pythagoras.openapi.api.CalculatorApi;
import com.calculator_pythagoras.openapi.model.PythagorasRequest;
import com.calculator_pythagoras.openapi.model.PythagorasResponse;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@OpenAPIDefinition(
        info = @Info(
                title = "Api -  Calculator Pythagoras",
                version = "1.0",
                description = "Develop a calculator that is able to calculate the relationship between the sides of a right triangle (Pythagorean theorem). The calculator receives the values of the legs (adjacent and opposite) to calculate the value of the hypotenuse."
        )
)
@RestController
public class CalculatorPythagorasController implements CalculatorApi {
    CalculatorPythagorasService pythagorasService;

    public CalculatorPythagorasController(CalculatorPythagorasService service){
        this.pythagorasService = service;
    }


    @Override
    public ResponseEntity calculatorPythagoras(PythagorasRequest request) {
        try {
            PythagorasResponse response = new PythagorasResponse();
            BigDecimal adjacentValue = BigDecimal.valueOf(request.getAdjacentValue());
            BigDecimal oppositeValue = BigDecimal.valueOf(request.getOppositeValue());
            BigDecimal pythagoras = pythagorasService.calculate(adjacentValue, oppositeValue);
            response.setResult(pythagoras.doubleValue());
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (BusinessException exception) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getBusinessMessage());
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
        }
    }

}
