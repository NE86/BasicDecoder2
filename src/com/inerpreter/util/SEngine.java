package com.inerpreter.util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SEngine {

    private static ScriptEngineManager manager = new ScriptEngineManager();
    private static ScriptEngine engine = manager.getEngineByName("js");

    public static Object engine(String str) {
        try {
            return engine.eval(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return null;
    }
}
