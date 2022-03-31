package com.designpattern.observer;

/**
 * @Auther: 刘杰
 * @Date: 2022/3/31 - 03 - 31 - 12:51
 * @Description: com.designpattern.observer
 * @version: 1.0
 */
public class Message {

    private String code;
    private String content;

    public Message(String code, String content) {
        this.code = code;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code='" + code + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
