package com.designpattern.visitor.accept;

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

    public abstract void accept(Extrator extrator);

    @Override
    public String toString() {
        return "ResourceFile{" +
                "path='" + path + '\'' +
                '}';
    }
}
