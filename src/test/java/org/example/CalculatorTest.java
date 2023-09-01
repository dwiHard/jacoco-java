package org.example;


import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 3);
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5, 2);
        Assert.assertEquals(3, result, 0);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(4, 3);
        Assert.assertEquals(12, result, 0);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
