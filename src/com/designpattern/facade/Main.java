package com.designpattern.facade;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 9:56
 * @Description: com.designpattern.facade
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        FacadeService service = new FacadeService();
        service.apply();
    }
}
