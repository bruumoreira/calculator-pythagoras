package com.calculator.pythagoras.service;

import com.calculator.pythagoras.persistence.HistoryPythagorasEntity;
import com.calculator.pythagoras.repository.HistoryPythagorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HistoryPythagorasService {
    private HistoryPythagorasRepository historyPythagorasRepository;

    public HistoryPythagorasService(HistoryPythagorasRepository repository){
        this.historyPythagorasRepository = repository;
    }

    public void save(BigDecimal adjacentValue, BigDecimal oppositeValue, BigDecimal hypotenuseValue) {
        this.historyPythagorasRepository.save(new HistoryPythagorasEntity(adjacentValue, oppositeValue, hypotenuseValue));
    }

    public List<HistoryPythagorasEntity> findAll() {
        return this.historyPythagorasRepository.findAll();
    }

    public long count() {
        return this.historyPythagorasRepository.count();
    }

    public HistoryPythagorasEntity findById(String id) {
        return this.historyPythagorasRepository.findById(id).get();
    }

    public void delete(String id) {
        this.historyPythagorasRepository.deleteById(id);
    }
}

