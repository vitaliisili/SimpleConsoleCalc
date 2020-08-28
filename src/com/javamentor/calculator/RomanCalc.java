package com.javamentor.calculator;

import com.javamentor.convertor.ConverToRoman;

public class RomanCalc extends Calculator {

    private String operationResult;

    public RomanCalc(String line) {
        super(line);
        operationResult = calculate();
    }

    @Override
    public String showResult() {
        return ConverToRoman.toRoman(Integer.parseInt(operationResult));
    }


}
