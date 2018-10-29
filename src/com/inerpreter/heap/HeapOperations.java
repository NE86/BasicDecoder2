package com.inerpreter.heap;

import com.inerpreter.util.VariableUtils;

import java.util.stream.Collectors;

public class HeapOperations {

    public static String getValue(String str) {
        return VariableUtils.isVariable(str) ? Heap.getVariable(str).toString() : str;
    }

    public static String getExpression(int row, int countSkip) {
        return Heap.getCodeFragment(row).stream()
                .skip(countSkip)
                .map(HeapOperations::getValue)
                .collect(Collectors.joining());
    }
}
