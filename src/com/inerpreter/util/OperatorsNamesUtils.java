package com.inerpreter.util;

import com.inerpreter.operators.names.OperatorsNamesEnum;

import java.util.Arrays;

public class OperatorsNamesUtils {

    public static OperatorStrategy searchStrategy(String name) {
        return Arrays.stream(OperatorsNamesEnum.values())
                .filter(operatorName -> operatorName.getName().equals(name))
                .map(OperatorsNamesEnum::getStrategy)
                .findAny()
                .orElse(null);
    }

}
