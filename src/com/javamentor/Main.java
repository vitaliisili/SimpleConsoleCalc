package com.javamentor;

import com.javamentor.calculator.ArabicCalc;
import com.javamentor.calculator.Calculator;
import com.javamentor.calculator.RomanCalc;
import com.javamentor.exception.ConsoleInputError;
import com.javamentor.helper.Checker;
import com.javamentor.helper.ConsoleHelper;

public class Main {
    public static void main(String[] args) throws ConsoleInputError {
        ConsoleHelper.intro();
        String line = ConsoleHelper.readLine();

        Calculator calculator = null;
        Checker checker = new Checker(line);

        if (checker.isValidLine()){
            if (checker.isArabicExpresion()){
                calculator = new ArabicCalc(line);
            }else {
                calculator = new RomanCalc(line);
            }
        }else{
            throw new ConsoleInputError();
        }

        ConsoleHelper.write(calculator.showResult());
    }
}
