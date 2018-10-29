package com.inerpreter.util;

import com.inerpreter.heap.Heap;

public class VariableUtils {

    //Проверяем является ли строка числом
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isVariable(String str) {
        return Heap.getVariable(str) != null;
    }



}
