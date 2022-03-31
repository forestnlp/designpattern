package com.designpattern.chain.v1;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 15:41
 * @Description: com.designpattern.chain
 * @version: 1.0
 */
public abstract class Filter {
    private Filter next;

    public void setNext(Filter next) {
        this.next = next;
    }

    public final void handle(String content){
        boolean injected = check(content);
        if(next!=null&&!injected) {
            next.handle(content);
        }
    }

    abstract boolean check(String content);
}
