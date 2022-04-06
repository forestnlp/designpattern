package com.designpattern.memorize;

public class Main {

    public static void main(String[] args) {
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Game game = new Game(100,210,"五蛇殿");
        snapshotHolder.addSnapShot(game.save());
        System.out.println("当前game state:"+game);

        game.setHealth(80);
        game.setMagic(20);
        game.setTown("土城");
        snapshotHolder.addSnapShot(game.save());
        System.out.println("当前game state:"+game);

        game.setHealth(100);
        game.setMagic(50);
        game.setTown("机关洞");
        snapshotHolder.addSnapShot(game.save());
        System.out.println("当前game state:"+game);

        game.restore(snapshotHolder.getSnapShot(0));
        System.out.println("读档后:game state:"+game);
    }
}
