package com.designpattern.adaptor.combination;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:06
 * @Description: com.designpattern.adapter.combination
 * @version: 1.0
 */
public class IOLD_impl implements IOLD {
    @Override
    public void supply() {
        System.out.println("提供IOLD_impl服务");
    }
}
