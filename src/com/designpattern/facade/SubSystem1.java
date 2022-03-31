package com.designpattern.facade;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:46
 * @Description: com.designpattern.facade
 * @version: 1.0
 */
public class SubSystem1 {
    public boolean dbtransaction() {
        System.out.println("做一些数据库事务");
        return true;
    }
}
