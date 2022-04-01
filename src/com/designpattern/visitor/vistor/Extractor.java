package com.designpattern.visitor.vistor;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 15:01
 * @Description: com.designpattern.visitor.vistor
 * @version: 1.0
 */
public class Extractor implements Vistor{
    @Override
    public void visit(XmlFile file) {
        System.out.println("Extrating XmlFile "+ file);
    }

    @Override
    public void visit(ExcelFile file) {
        System.out.println("Extrating ExcelFile "+ file);
    }
}
