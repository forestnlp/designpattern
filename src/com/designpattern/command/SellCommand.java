package com.designpattern.command;

public class SellCommand implements Command{

    private OrderService service;

    public SellCommand(OrderService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.sell();
    }
}
