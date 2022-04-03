package com.designpattern.interpreter;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        String expStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HashMap<String,Integer> map = new HashMap<>();
        for(char c:expStr.toCharArray()) {
            if(c!='+'&&c!='-'&&!map.containsKey(String.valueOf(c))){
                String val = new BufferedReader(new InputStreamReader(System.in)).readLine();
                map.put(String.valueOf(c),Integer.valueOf(val));
            }
        }
        Calculator calculator = new Calculator();
        Expression expression = calculator.parse(expStr);
        System.out.println("运算结果：" + expStr + "=" + expression.interpreter(map));
    }
}
