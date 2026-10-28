package edu.cmu.cc.project2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(long first, long second) {
        return first+second;
    }

    @Override
    public double subtract(long first, long second) {
        return first-second;
    }

    @Override
    public double multiply(long first, long second) {
        return first*second;
    }

    @Override
    public double divide(long first, long second) {
        return (double)first/second;
    }

    @Override
    public double fibonacci(long number) {
        if (number <= 1)
            return number;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
