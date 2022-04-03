package com.designpattern.mediator;

public class Main {
    public static void main(String[] args) {
        Chatroom chatroom = new Chatroom();
        User jingchou = new User(chatroom,"陈靖仇");
        User xiaoxue = new User(chatroom,"小雪");
        User yuer = new User(chatroom,"拓跋玉儿");
        jingchou.say("小雪，我好想你");
        xiaoxue.say("陈哥哥我也是");
        yuer.say("那就不想我了吗");
        jingchou.say("当然想啊，玉儿姐姐你也在啊");
        xiaoxue.say("玉儿姐姐别误会");
    }
}
