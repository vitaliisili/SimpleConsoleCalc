package com.javamentor.calculator;

public class ArabicCalc extends Calculator {
    private String operationResult;

    public ArabicCalc(String line) {
        super(line);
        operationResult = calculate();
    }

    @Override
    public String showResult() {
        return operationResult;
    }


}
