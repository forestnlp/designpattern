package com.designpattern.chain.v1;


/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:47
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Filter filter = new NegativeWordFilter();
        filter.setNext(new SensitiveWordFilter());
        filter.handle("ni是中国人");
        filter.handle("ni<script>是中国人");
        filter.handle("ni是中国人烂");
    }
}
