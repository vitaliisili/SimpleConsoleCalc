package com.javamentor.convertor;

import java.util.HashMap;

public class ConverToArab {
    public static HashMap<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
    }

    private static int getRomanNumeralValue(char ch) {
            return map.get(ch);
    }

    public static int convertRomanToDecimal(String pRomanNumeral) {
        int index = pRomanNumeral.length() - 1;
        int result = getRomanNumeralValue(pRomanNumeral.charAt(index));

        for (int i = index - 1; i >= 0; i--) {
            if (getRomanNumeralValue(pRomanNumeral.charAt(i)) >= getRomanNumeralValue(pRomanNumeral.charAt(i + 1))) {
                result = result + getRomanNumeralValue(pRomanNumeral.charAt(i));
            } else {
                result = result - getRomanNumeralValue(pRomanNumeral.charAt(i));
            }
        }
        return result;
    }
}
