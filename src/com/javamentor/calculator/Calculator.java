package com.javamentor.calculator;

import com.javamentor.convertor.ConverToArab;
import com.javamentor.helper.Checker;

public abstract class Calculator {
    Checker checker;
    String[] operands;
    private int firstOerand, secondOerand;

    public Calculator(String line) {
        this.operands = line.split(" ");
        checker = new Checker(line);
        convertOperands();
    }

    private void convertOperands() {
        if (checker.isArabic(operands[0])) {
            firstOerand = Integer.parseInt(operands[0]);
            secondOerand = Integer.parseInt(operands[2]);
        }else{
            firstOerand = ConverToArab.convertRomanToDecimal(operands[0]);
            secondOerand = ConverToArab.convertRomanToDecimal(operands[2]);
        }
    }


    public String calculate() {
        String result = null;
        switch (operands[1]){
            case "+": result = add();
            break;
            case "-": result = sub();
            break;
            case "*": result = multiply();
            break;
            case "/": result = divide();
        }
        return result;
    }

    private String add() {
        return String.valueOf(firstOerand + secondOerand);
    }

    private String multiply() {
        return String.valueOf(firstOerand * secondOerand);
    }

    private String divide() {
        return String.valueOf(firstOerand / secondOerand);
    }

    private String sub() {
        return String.valueOf(firstOerand - secondOerand);
    }

    public abstract String showResult();

}
