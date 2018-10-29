package com.inerpreter.operators;

import com.inerpreter.heap.HeapOperations;
import com.inerpreter.operators.names.OperatorsNamesEnum;
import com.inerpreter.util.OperatorStrategy;
import com.inerpreter.util.VariableUtils;

public class GoToOperator implements OperatorStrategy {

    @Override
    public OperatorsNamesEnum getName() {
        return OperatorsNamesEnum.GOTO;
    }

    @Override
    public Integer action(int row) {
        String expression = HeapOperations.getExpression(row, 1);
        return VariableUtils.isNumber(expression) ? Integer.parseInt(expression) : row;
    }
}
