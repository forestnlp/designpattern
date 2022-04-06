package com.designpattern.memorize;

public class Snapshot {
    private int health;
    private int magic;
    private String town;

    public Snapshot(int health, int magic, String town) {
        this.health = health;
        this.magic = magic;
        this.town = town;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
