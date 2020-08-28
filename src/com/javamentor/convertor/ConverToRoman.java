package com.javamentor.convertor;

import com.javamentor.helper.ConsoleHelper;

import java.util.TreeMap;

public class ConverToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String toRoman(int number) {
        if (number == 0){
            ConsoleHelper.write("Result is 0 buts in Roman numerals don't exist 0");
           return null;
        }

        int result;
        boolean flag = false;
        if (number < 0){
            result = Math.abs(number);
            flag = true;
        }else {
            result = number;
        }

        int l =  map.floorKey(result);
        if ( result == l ) {
            if (flag) return "-" + map.get(result);
            else return map.get(result);
        }

        return map.get(l) + toRoman(result-l);
    }

}
