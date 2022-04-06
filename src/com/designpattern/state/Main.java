package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:37
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        System.out.println(machine.getPower()+","+machine.getCurrentState().getState());
        machine.getCurrentState().evolution();
        System.out.println(machine.getPower()+","+machine.getCurrentState().getState());
        machine.getCurrentState().evolution();
        System.out.println(machine.getPower()+","+machine.getCurrentState().getState());
        machine.getCurrentState().attacked();
        System.out.println(machine.getPower()+","+machine.getCurrentState().getState());
        machine.getCurrentState().evolution();
        System.out.println(machine.getPower()+","+machine.getCurrentState().getState());
    }
}
