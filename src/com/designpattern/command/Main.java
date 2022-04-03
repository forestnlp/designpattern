package com.designpattern.command;

public class Main {
    public static void main(String[] args) {
        Command c1 = new BuyCommand(new OrderService("trousers",20));
        Command c2 = new BuyCommand(new OrderService("desses",10));

        Broker broker = new Broker();
        broker.add(c1);
        broker.add(c2);
        broker.runCommands();
    }
}
