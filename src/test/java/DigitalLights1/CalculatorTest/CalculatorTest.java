package DigitalLights1.CalculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import DigitalLights1.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testFib() {
        int result = calculator.fib(10);
        assertEquals(55, result);
    }
    @Test
    public void testFactorial() {
        long result = calculator.factorial(6);
        assertEquals(720, result);
    }
    @Test
    public void testLowestCommonMultiple() {
        int result = calculator.lowestCommonMultiple(54, 80);
        assertEquals(2160, result);
    }
    @Test
    public void testGreatestCommonDivisor() {
        int result = calculator.greatestCommonDivisor(216, 80);
        assertEquals(8, result);
    }
}
