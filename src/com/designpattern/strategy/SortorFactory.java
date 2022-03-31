package com.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 14:06
 * @Description: com.designpattern.strategy
 * @version: 1.0
 */
public class SortorFactory {
    private static final Map<String,Sortor> strategies = new HashMap<>();
    static {
        strategies.put("default",new DefaultSortor());
        strategies.put("merge",new MergeSortor());
    }

    public static Sortor getInstance(String type) {
        return strategies.get(type);
    }
}
