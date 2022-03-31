package com.designpattern.chain.v2;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:41
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public interface Filter {
    boolean doFilter(String content);
}
