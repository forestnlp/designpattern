package com.designpattern.mediator;

public class User {
    private Chatroom chatroom;
    private String userName;

    public User(Chatroom chatroom, String userName) {
        this.chatroom = chatroom;
        this.userName = userName;
    }

    @Override
    public String toString() {
        String rtn=userName;
        for(int i=0;i<5-userName.length();i++)
            rtn+=" ";
        return rtn;
    }

    public void say(String message){
        chatroom.show(this,message);
    }

}
