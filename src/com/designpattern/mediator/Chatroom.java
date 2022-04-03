package com.designpattern.mediator;

import java.time.LocalTime;

public class Chatroom {
    public void show(User user,String message) {
        System.out.println("[系统时间："+ LocalTime.now()+"]["+user+"]说:\t"+message);
    }
}
