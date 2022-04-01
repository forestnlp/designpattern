package com.designpattern.visitor.vistor;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 15:00
 * @Description: com.designpattern.visitor.vistor
 * @version: 1.0
 */
public interface Vistor {
    void visit(XmlFile file);
    void visit(ExcelFile file);
}
