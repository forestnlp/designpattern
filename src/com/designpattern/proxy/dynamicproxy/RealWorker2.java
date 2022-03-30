package com.designpattern.proxy.dynamicproxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 14:37
 * @Description: com.designpattern.proxy.staticproxy
 * @version: 1.0
 */
public class RealWorker2 implements Worker {

    public void compute() {
        System.out.println("real worker2 is computing");
    }

}
