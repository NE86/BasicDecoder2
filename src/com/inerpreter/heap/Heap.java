package com.inerpreter.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Heap {
    private static TreeMap<Integer, ArrayList<String>> code;
    private static HashMap<String, Object> variable = new HashMap<>();

    public static void initializeHeap(TreeMap<Integer, ArrayList<String>> code) {
        Heap.code = code;
    }

    public static ArrayList<String> getCodeFragment(Integer row) {
        return code.get(row);
    }

    public static String getCodeCell(Integer row, Integer column) {
        return code.get(row).get(column);
    }

    public static Object getVariable(String name) {
        return variable.get(name);
    }

    public static void setVariable(String name, Object value) {
        variable.put(name, value);
    }


}
