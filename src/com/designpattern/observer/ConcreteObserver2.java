package com.designpattern.observer;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update(Message msg) {
        System.out.println("Log saved "+ msg);
    }
}