package edu.cmu.cc.project2.service;

import org.springframework.stereotype.Component;

@Component("calculatorService")
public interface CalculatorService {

    double add(long first, long second);
    double subtract(long first, long second);
    double multiply(long first, long second);
    double divide(long first, long second);
    double fibonacci(long number);
}
