package com.designpattern.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression{
    private String var;

    public VarExpression(String var) {
        this.var = var;
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return map.get(var);
    }
}
