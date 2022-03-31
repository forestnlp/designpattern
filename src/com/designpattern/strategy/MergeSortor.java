package com.designpattern.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 13:46
 * @Description: com.designpattern.strategy
 * @version: 1.0
 */
public class MergeSortor implements Sortor{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr);
    }

    private static int[] mergeSort(int[] arr) {
        //当数组长度为1时,递归回升
        if (arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(arr, mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] arr, int[] left, int[] right) {
        //left数组的下标
        int i = 0;
        //right数组的下标
        int j = 0;
        for (int index = 0; index < arr.length; index++) {
            //注意一下，数组越界问题
            //i>=left.length时,将right数组的值给arr
            if (i>=left.length){
                arr[index]=right[j++];
            }else if(j>=right.length){
                arr[index]=left[i++];
            }else if (left[i]<right[j]){
                //left[i]<right[j]时,将left数组的值给arr,小的优先给arr
                arr[index]=left[i++];
            }else {
                arr[index]=right[j++];
            }
        }
        return arr;
    }
}
