package com.javamentor.helper;

public class Checker {
    private String line;
    private boolean isArabicExpresion;

    public Checker(String line) {
        this.line = line;
    }

    public boolean isValidLine() {
        String[] operators = line.split(" ");


        if (operators.length != 3) {
            return false;
        }

        String firstOperand = operators[0];
        String operator = operators[1];
        String secondOperand = operators[2];

        if (operator.equals("/") && secondOperand.equals("0")) {
            return false;
        }

        if (isRoman(firstOperand) && isOperator(operator) && isRoman(secondOperand)) {
            isArabicExpresion = false;
            return true;
        }

        if (isArabic(firstOperand) && isOperator(operator) && isArabic(secondOperand)) {
            isArabicExpresion = true;
            return true;
        }

        return false;
    }

    public boolean isRoman(String str) {
        switch (str) {
            case "I":
            case "II":
            case "III":
            case "IV":
            case "V":
            case "VI":
            case "VII":
            case "VIII":
            case "IX":
            case "X":
                return true;
            default:
                return false;
        }

    }

    public boolean isArabic(String str) {
        int number;

        try {
            number = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }

        if (!(number > 10)) {
            return true;
        }

        return false;
    }

    public boolean isOperator(String str) {
        switch (str) {
            case "+":
            case "-":
            case "/":
            case "*":
                return true;
            default:
                return false;
        }
    }

    public boolean isArabicExpresion() {
        isValidLine();
        return isArabicExpresion;
    }
}
