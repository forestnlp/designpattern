package com.designpattern.command;

public class BuyCommand implements Command{

    private OrderService service;

    public BuyCommand(OrderService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.buy();
    }
}
