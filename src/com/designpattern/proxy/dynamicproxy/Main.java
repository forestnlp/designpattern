package com.designpattern.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 15:20
 * @Description: com.designpattern.proxy.dynamicproxy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        Worker realWorker = new RealWorker();
        //Worker realWorker2 = new RealWorker2();

        InvocationHandler handler = new WorkerInvocationHandler(realWorker);
        ClassLoader loader = realWorker.getClass().getClassLoader();
        Class[] interfaces = realWorker.getClass().getInterfaces();

        Worker proxyworker = (Worker) Proxy.newProxyInstance(loader, interfaces, handler);

        proxyworker.compute();
    }
}
