package com.designpattern.memorize;

public class Game {

    private int health;
    private int magic;
    private String town;

    public Game(int health, int magic, String town) {
        this.health = health;
        this.magic = magic;
        this.town = town;
    }

    public Snapshot save(){
        return new Snapshot(health,magic,town);
    }

    public void restore(Snapshot snapshot) {
        this.health = snapshot.getHealth();
        this.magic = snapshot.getMagic();
        this.town = snapshot.getTown();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Game{" +
                "health=" + health +
                ", magic=" + magic +
                ", town='" + town + '\'' +
                '}';
    }
}
