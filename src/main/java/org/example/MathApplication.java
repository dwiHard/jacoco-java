package org.example;

import org.example.service.CalculatorService;

public class MathApplication {
    private CalculatorService calcService;

    public double add(double input1, double input2){
        return calcService.add(input1, input2);
    }
}
