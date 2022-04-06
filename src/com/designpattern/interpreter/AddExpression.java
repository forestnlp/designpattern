package com.designpattern.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) + super.right.interpreter(map);
    }
}
