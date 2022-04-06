package com.designpattern.command;

public class OrderService {
    private String name;
    private double amount;

    public OrderService(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void sell(){
        System.out.println("sell product :"+name+" ,amount="+amount);
    }

    public void buy(){
        System.out.println("buy product :"+name+" ,amount="+amount);
    }
}
