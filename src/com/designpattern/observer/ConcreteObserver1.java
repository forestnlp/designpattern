package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 12:52
 * @Description: com.designpattern.observer
 * @version: 1.0
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void update(Message msg) {
        System.out.println("DB saved "+ msg);
    }
}
