package com.designpattern.adaptor.combination;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:10
 * @Description: com.designpattern.adapter.combination
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        INEW n = new INEW_adaptor(new IOLD_impl());
        n.supply_v2();
    }
}
