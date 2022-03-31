package com.designpattern.observer;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 12:49
 * @Description: com.designpattern.observer
 * @version: 1.0
 */
public interface Subject {
    void register(Observer o);
    void notify(Message message);
    void deregister(Observer o);
}
