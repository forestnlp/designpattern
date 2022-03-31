package com.designpattern.composite;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 10:12
 * @Description: com.designpattern.composite
 * @version: 1.0
 */
public abstract class FileNode {
    private String path;

    public FileNode(String path) {
        this.path = path;
    }

    public abstract int count();
}
