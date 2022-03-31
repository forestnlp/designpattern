package com.designpattern.strategy;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 14:00
 * @Description: com.designpattern.strategy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8,9,1,23,5,6,11,1};
        //Sortor sortor = new MergeSortor();
        Sortor sortor = SortorFactory.getInstance("merge");
        sortor.sort(arr);
        for(int a:arr)
            System.out.print(a+"\t");


    }
}
