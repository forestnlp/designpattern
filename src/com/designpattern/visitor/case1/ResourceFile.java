package com.designpattern.visitor.case1;

/**
 * @Auther: 刘杰
 * @Date: 2022/4/1 - 04 - 01 - 12:58
 * @Description: com.designpattern.visitor.badcase
 * @version: 1.0
 */
public abstract class ResourceFile {
    protected String path;

    public ResourceFile(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ResourceFile{" +
                "path='" + path + '\'' +
                '}';
    }
}
