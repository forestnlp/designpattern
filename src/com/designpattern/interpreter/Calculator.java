package com.designpattern.interpreter;

import java.util.HashMap;
import java.util.Stack;


public class Calculator {
    public Expression parse(String expStr) { // expStr = a+b
        Stack<Expression> stack = new Stack<>();

        char[] charArray = expStr.toCharArray();// [a, +, b]

        Expression left = null;
        Expression right = null;

        //针对不同的情况，做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-': //
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new MinusExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        return stack.pop();
    }
}
