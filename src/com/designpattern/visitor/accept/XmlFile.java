package com.designpattern.visitor.accept;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 12:59
 * @Description: com.designpattern.visitor.badcase0
 * @version: 1.0
 */
public class XmlFile extends ResourceFile {

    public XmlFile(String path) {
        super(path);
    }

    @Override
    public void accept(Extrator extrator) {
        extrator.extract2txt(this);
    }
}
