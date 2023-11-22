package com.qmt.tutorial.fighter;

/**
 * Be like Kenshin
 */
public class SwordMan {

    private final String name;
    private final String swordName;
    private final int strength;
    private final int hp;

    public SwordMan(String name, String swordName, int hp, int strength) {
        this.name = name;
        this.swordName = swordName;
        this.strength = strength;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHp() {
        return hp;
    }

    public String getSwordName() {
        return swordName;
    }
}
