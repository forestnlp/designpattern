package com.designpattern.proxy.staticproxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 14:37
 * @Description: com.designpattern.proxy.staticproxy
 * @version: 1.0
 */
public class WorkerProxy2 extends RealWorker {

    private void log() {
        System.out.println("log something");
    }

    private void clean() {
        System.out.println("release resources");
    }

    @Override
    public void compute() {
        log();
        super.compute();
        clean();
    }
}
