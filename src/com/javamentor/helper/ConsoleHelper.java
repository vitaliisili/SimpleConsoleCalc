package com.javamentor.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public static String readLine(){
        String line = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            line = reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return line;
    }

    public static void write(String str){
        System.out.println(str);
    }

    public static void intro(){
        write("Hello input please number for calculate, Arabic numbers in range 1 - 10, Roman numbers in range I - X, rite expresion in one line example: 1 + 3 or V * III:");
    }


}
