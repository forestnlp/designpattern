package com.designpattern.visitor.case0;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 12:59
 * @Description: com.designpattern.visitor.badcase0
 * @version: 1.0
 */
public class ExcelFile extends ResourceFile{

    public ExcelFile(String path) {
        super(path);
    }

    @Override
    public void extract2txt() {
        System.out.println("Extracting xls 2 txt");
    }
}
