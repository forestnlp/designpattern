package com.designpattern.bridge;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 16:34
 * @Description: com.designpattern.bridge
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new DellComputer(new WindowsOperationSystem());
        computer.work();

        Computer computer2 = new DellComputer(new LinuxOperationSystem());
        computer2.work();

        Computer computer3 = new AppleComputer(new MacOperationSystem());
        computer3.work();
    }
}
