package com.inerpreter.tree;

import com.inerpreter.context.Operators;
import com.inerpreter.heap.Heap;
import com.inerpreter.util.OperatorStrategy;
import com.inerpreter.util.OperatorsNamesUtils;

public class AnalyzeTree {

    private Operators operators;
    private int lastKey;

    public AnalyzeTree(int lastKey) {
        this.operators = new Operators();
        this.lastKey = lastKey;
    }

    public Integer run(int row) {
        OperatorStrategy strategy = OperatorsNamesUtils.searchStrategy(Heap.getCodeCell(row, 0));
        operators.setStrategy(strategy);
        row = operators.actionStrategy(row);
        if (row > lastKey) {
            return row;
        } else {
            return run(row);
        }
    }
}
