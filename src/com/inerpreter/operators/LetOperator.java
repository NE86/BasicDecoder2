package com.inerpreter.operators;

import com.inerpreter.heap.Heap;
import com.inerpreter.heap.HeapOperations;
import com.inerpreter.operators.names.OperatorsNamesEnum;
import com.inerpreter.util.OperatorStrategy;
import com.inerpreter.util.SEngine;

public class LetOperator implements OperatorStrategy {

    @Override
    public OperatorsNamesEnum getName() {
        return OperatorsNamesEnum.LET;
    }

    @Override
    public Integer action(int row) {
        String expression = HeapOperations.getExpression(row, 3);
        Heap.setVariable(Heap.getCodeCell(row, 1), SEngine.engine(expression));
        return ++row;
    }
}
