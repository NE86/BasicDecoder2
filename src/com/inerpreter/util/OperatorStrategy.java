package com.inerpreter.util;

import com.inerpreter.operators.names.OperatorsNamesEnum;

public interface OperatorStrategy {

    OperatorsNamesEnum getName();

    Integer action(int row);

}
