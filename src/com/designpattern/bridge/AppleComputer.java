package com.designpattern.bridge;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 16:30
 * @Description: com.designpattern.bridge
 * @version: 1.0
 */
public class AppleComputer extends Computer{

    public AppleComputer(OperationSystem os) {
        super(os);
    }

    @Override
    public void work() {
        System.out.println("Apple 笔记本，开机启动");
        os.run();
    }
}
