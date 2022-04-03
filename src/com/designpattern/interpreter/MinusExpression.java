package com.designpattern.interpreter;

import java.util.HashMap;

public class MinusExpression extends SymbolExpression{
    public MinusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) - super.right.interpreter(map);
    }
}
