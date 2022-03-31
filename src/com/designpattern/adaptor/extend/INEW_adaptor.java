package com.designpattern.adaptor.extend;



/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:10
 * @Description: com.designpattern.adapter.combination
 * @version: 1.0
 */
public class INEW_adaptor extends OLD implements INEW {
    @Override
    public void supply_v2() {
        System.out.println("使用适配器。调用原有功能");
        super.supply();
    }
}
