package com.designpattern.bridge;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 16:32
 * @Description: com.designpattern.bridge
 * @version: 1.0
 */
public class MacOperationSystem extends OperationSystem{
    @Override
    public void run() {
        System.out.println("Mac操作系统，操作系统加载");
    }
}
