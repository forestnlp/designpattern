package com.designpattern.proxy.staticproxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 14:41
 * @Description: com.designpattern.proxy.staticproxy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new WorkerProxy(new RealWorker());
        worker.compute();
    }
}
