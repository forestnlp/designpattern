package com.designpattern.builder;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 11:22
 * @Description: com.designpattern.builder
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Config cfg = new Config.Builder().setConn(10,2,1).setTimeOut(60,3).build();
        System.out.println(cfg);
    }
}
