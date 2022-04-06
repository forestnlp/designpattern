package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:29
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public class StateMachine {

    private int power;
    private GreenMan currentState;

    public StateMachine() {
        this.power = 0;
        this.currentState = new Doctor(this);
    }

    public int getPower() {
        return power;
    }

    public void powerUp(int power) {
        this.power += power;
    }

    public void powerDown(int power) {
        this.power -= power;
    }

    public GreenMan getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GreenMan currentState) {
        this.currentState = currentState;
    }
}
