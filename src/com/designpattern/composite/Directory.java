package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 10:11
 * @Description: com.designpattern.composite
 * @version: 1.0
 */
public class Directory extends FileNode {
    private List<FileNode> subNodes = new ArrayList<>();
    public void add(FileNode element) {
        subNodes.add(element);
    }
    public Directory(String path) {
        super(path);
    }
    @Override
    public int count() {
        int count = 0;
        for(FileNode node:subNodes){
            count += node.count();
        }
        return count;
    }
}
