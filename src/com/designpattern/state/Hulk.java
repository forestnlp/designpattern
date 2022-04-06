package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:35
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public class Hulk implements GreenMan {
    private StateMachine stateMachine;
    public Hulk(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getState() {
        return State.GREEN;
    }

    @Override
    public void evolution() {
        stateMachine.powerUp(100);
    }

    @Override
    public void attacked() {
        stateMachine.setCurrentState(new Monster(stateMachine));
        stateMachine.powerDown(50);
    }
}
