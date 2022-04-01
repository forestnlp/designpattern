package com.designpattern.visitor.case0;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 13:03
 * @Description: com.designpattern.visitor.badcase0
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<ResourceFile> files = new ArrayList<>();
        files.add(new XmlFile("abc.xml"));
        files.add(new ExcelFile("bcd.xls"));
        for(ResourceFile file:files) {
            file.extract2txt();
        }
    }
}
