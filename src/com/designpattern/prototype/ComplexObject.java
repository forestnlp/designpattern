package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/30 - 03 - 30 - 11:26
 * @Description: com.designpattern.prototype
 * @version: 1.0
 */
public class ComplexObject implements Cloneable{

    private int id = 100;
    private String name;
    private int [] arr;

    public ComplexObject(int id, String name, int[] arr) {
        this.id = id;
        this.name = name;
        this.arr = arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public ComplexObject clone() throws CloneNotSupportedException {
        System.out.println("复制");
        ComplexObject prototype = (ComplexObject)super.clone();
        prototype.arr = this.arr.clone();
        return prototype;
    }
}
