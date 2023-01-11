package com.calculator.pythagoras.persistence;

import lombok.Getter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "history_pythagoras")
@Getter
public class HistoryPythagorasEntity {
    @Id
    private String id;
    private LocalDateTime date;
    private BigDecimal adjacentValue;

    private BigDecimal oppositeValue;

    private BigDecimal hypotenuseValue;

    public HistoryPythagorasEntity(BigDecimal adjacentValue, BigDecimal oppositeValue, BigDecimal hypotenuseValue) {
        this.adjacentValue = adjacentValue;
        this.oppositeValue = oppositeValue;
        this.hypotenuseValue = hypotenuseValue;
        this.date = LocalDateTime.now();
    }

}
