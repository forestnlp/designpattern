package com.designpattern.proxy.staticproxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 14:37
 * @Description: com.designpattern.proxy.staticproxy
 * @version: 1.0
 */
public class WorkerProxy implements Worker {

    private Worker realworker;

    public void setRealworker(Worker realworker) {
        this.realworker = realworker;
    }

    public WorkerProxy(Worker realworker) {
        this.realworker = realworker;
    }

    private void log(){
        System.out.println("log something");
    }

    private void clean(){
        System.out.println("release resources");
    }

    @Override
    public void compute() {
        log();
        realworker.compute();
        clean();
    }

}
