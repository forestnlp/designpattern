package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:33
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public class Monster implements GreenMan {
    private StateMachine stateMachine;

    public Monster(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getState() {
        return State.GRAY;
    }

    @Override
    public void evolution() {
        stateMachine.setCurrentState(new Hulk(stateMachine));
        stateMachine.powerUp(100);
    }

    @Override
    public void attacked() {
        stateMachine.powerDown(50);
        stateMachine.setCurrentState(new Doctor(stateMachine));
    }
}
