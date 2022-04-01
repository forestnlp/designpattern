package com.designpattern.visitor.vistor;


/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 12:59
 * @Description: com.designpattern.visitor.badcase0
 * @version: 1.0
 */
public class ExcelFile extends ResourceFile {

    public ExcelFile(String path) {
        super(path);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
