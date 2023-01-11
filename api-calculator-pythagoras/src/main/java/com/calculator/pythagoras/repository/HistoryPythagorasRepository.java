package com.calculator.pythagoras.repository;

import com.calculator.pythagoras.persistence.HistoryPythagorasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HistoryPythagorasRepository extends MongoRepository<HistoryPythagorasEntity, String>{
}
