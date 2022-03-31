package com.designpattern.template;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 13:19
 * @Description: com.designpattern.template
 * @version: 1.0
 */
public abstract class TemplateClass {

    public abstract void open();
    public abstract void put();
    public abstract void close();

    public final void execute(){
        open();
        put();
        close();
    }
}
