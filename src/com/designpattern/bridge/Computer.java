package com.designpattern.bridge;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 16:27
 * @Description: com.designpattern.bridge
 * @version: 1.0
 */
public abstract class Computer {
    protected OperationSystem os;

    public Computer(OperationSystem os) {
        this.os = os;
    }

    public abstract void work();
}
