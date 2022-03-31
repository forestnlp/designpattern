package com.designpattern.chain.v1;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:42
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public class SensitiveWordFilter extends Filter {
    @Override
    boolean check(String content) {
        boolean injected = false;
        if(content.contains("<script")) {
            System.out.println("拒绝");
            return true;
        }
        return injected;
    }
}
