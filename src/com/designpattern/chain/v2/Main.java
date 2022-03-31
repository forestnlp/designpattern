package com.designpattern.chain.v2;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:47
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        chain.add(new NegativeWordFilter());
        chain.add(new SensitiveWordFilter());
        System.out.println(chain.filter("ni是中国人"));
        System.out.println(chain.filter("ni<script>是中国人"));
        System.out.println(chain.filter("ni是中国人烂"));
    }
}
