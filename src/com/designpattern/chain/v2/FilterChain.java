package com.designpattern.chain.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:45
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();

    public void add(Filter filter) {
        filters.add(filter);
    }

    public boolean filter(String sentence){
        for(Filter filter:filters) {
            if(!filter.doFilter(sentence)) return false;
        }
        return true;
    }
}
