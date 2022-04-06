package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:22
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public class Doctor implements GreenMan{

    private StateMachine stateMachine;

    public Doctor(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getState() {
        return State.NORMAL;
    }

    @Override
    public void evolution() {
        stateMachine.setCurrentState(new Monster(stateMachine));
        stateMachine.powerUp(100);
    }

    @Override
    public void attacked() {
        stateMachine.powerUp(-50);
    }
}
