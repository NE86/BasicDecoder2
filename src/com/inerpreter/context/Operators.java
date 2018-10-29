package com.inerpreter.context;

import com.inerpreter.util.OperatorStrategy;

public class Operators {
    private OperatorStrategy operatorStrategy;

    public void setStrategy(OperatorStrategy strategy) {
        this.operatorStrategy = strategy;
    }

    public Integer actionStrategy(int row) {
        return operatorStrategy.action(row);
    }
}
