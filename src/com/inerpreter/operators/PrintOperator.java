package com.inerpreter.operators;

import com.inerpreter.heap.HeapOperations;
import com.inerpreter.operators.names.OperatorsNamesEnum;
import com.inerpreter.util.OperatorStrategy;
import com.inerpreter.util.SEngine;

public class PrintOperator implements OperatorStrategy {

    @Override
    public OperatorsNamesEnum getName() {
        return OperatorsNamesEnum.PRINT;
    }

    @Override
    public Integer action(int row) {
        System.out.println(
                SEngine.engine(HeapOperations.getExpression(row, 1))
        );
        return ++row;
    }

}
