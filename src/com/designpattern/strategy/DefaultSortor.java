package com.designpattern.strategy;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 13:46
 * @Description: com.designpattern.strategy
 * @version: 1.0
 */
public class DefaultSortor implements Sortor{
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
