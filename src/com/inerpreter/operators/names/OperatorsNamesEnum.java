package com.inerpreter.operators.names;

import com.inerpreter.operators.GoToOperator;
import com.inerpreter.operators.LetOperator;
import com.inerpreter.operators.PrintOperator;
import com.inerpreter.util.OperatorStrategy;

public enum OperatorsNamesEnum {
    PRINT(new PrintOperator(), "PRINT"),
    LET(new LetOperator(), "LET"),
    GOTO(new GoToOperator(), "GOTO");

    private OperatorStrategy strategy;
    private String name;

    OperatorsNamesEnum(OperatorStrategy strategy, String name) {
        this.strategy = strategy;
        this.name = name;
    }

    OperatorsNamesEnum() {

    }

    public OperatorStrategy getStrategy() {
        return strategy;
    }

    public String getName() {
        return name;
    }
}
