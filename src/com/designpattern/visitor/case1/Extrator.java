package com.designpattern.visitor.case1;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 13:05
 * @Description: com.designpattern.visitor.badcase1
 * @version: 1.0
 */
public class Extrator {
    public void extract2txt(ExcelFile file) {
        System.out.println("Extracting xls "+ file+" txt");
    }

    public void extract2txt(XmlFile file) {
        System.out.println("Extracting xml "+ file+" txt");
    }
}
