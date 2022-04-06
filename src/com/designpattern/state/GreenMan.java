package com.designpattern.state;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/6 - 04 - 06 - 17:04
 * @Description: com.designpattern.state
 * @version: 1.0
 */
public interface GreenMan {
    State getState();
    void evolution();
    void attacked();
}
