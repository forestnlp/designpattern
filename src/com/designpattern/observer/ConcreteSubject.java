package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 12:52
 * @Description: com.designpattern.observer
 * @version: 1.0
 */
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void notify(Message message) {
        for(Observer o:observers){
            o.update(message);
        }
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
    }
}
