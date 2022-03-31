package com.designpattern.chain.v2;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:42
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public class NegativeWordFilter implements Filter{
    @Override
    public boolean doFilter(String content) {
        boolean checked = true;
        if(content.contains("烂")) return false;
        return checked;
    }
}
