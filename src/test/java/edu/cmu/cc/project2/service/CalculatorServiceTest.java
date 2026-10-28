package edu.cmu.cc.project2.service;

import edu.cmu.cc.project2.config.MvcConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Test class for Calculator Service
 */
@SpringBootTest
@ContextConfiguration(classes = MvcConfig.class)
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    public void addTest() {

        long first = 40;
        long second = 50;
        // calls the add method from the CalculatorService
        double result = calculatorService.add(first, second);
        // Assert that expected and actual are equal within the given non-negative delta.
        Assertions.assertEquals(90, result, 0.0);
    }

    @Test
    public void subtractTest() {

        long first = 40;
        long second = 50;
        double result = calculatorService.subtract(first, second);
        Assertions.assertEquals(-10, result, 0.0);
    }

    @Test
    public void multiplyTest() {

        long first = 40;
        long second = 50;
        double result = calculatorService.multiply(first, second);
        Assertions.assertEquals(2000, result, 0.0);
    }

    @Test
    public void divideTest() {

        long first = 40;
        long second = 50;
        // both the inputs are long and expected out is in double
        double result = calculatorService.divide(first, second);
        Assertions.assertEquals(0.80, result, 0.0);
    }
}
