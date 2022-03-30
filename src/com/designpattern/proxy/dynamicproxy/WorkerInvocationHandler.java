package com.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 15:20
 * @Description: com.designpattern.proxy.dynamicproxy
 * @version: 1.0
 */
public class WorkerInvocationHandler implements InvocationHandler {

    private Object o;

    public WorkerInvocationHandler(final Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("prepare");
        Object res = method.invoke(o, args);
        System.out.println("clean");
        return res;
    }
}
