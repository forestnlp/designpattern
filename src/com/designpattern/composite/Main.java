package com.designpattern.composite;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 10:18
 * @Description: com.designpattern.composite
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("/");
        Directory d = new Directory("/d");
        Directory e = new Directory("/e");
        FileNode leaf1 = new File("/a.txt");
        FileNode leaf2 = new File("/b.txt");
        FileNode leaf3 = new File("/c.txt");
        FileNode leaf4 = new File("/d/a.txt");
        FileNode leaf5 = new File("/d/e/a.txt");

        root.add(d);

        root.add(leaf1);
        root.add(leaf2);
        root.add(leaf3);

        d.add(leaf4);
        d.add(e);

        e.add(leaf5);

        System.out.println(root.count());
        System.out.println(d.count());
        System.out.println(e.count());
    }
}
