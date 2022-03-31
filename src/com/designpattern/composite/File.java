package com.designpattern.composite;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 10:11
 * @Description: com.designpattern.composite
 * @version: 1.0
 */
public class File extends FileNode {

    public File(String path) {
        super(path);
    }

    @Override
    public int count() {
        return 1;
    }
}
