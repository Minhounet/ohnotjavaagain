package com.qmt.tutorial.fighter;

import java.util.Random;

public class SwordMan implements Fighter {

    private static final Random random = new Random();

    private final String name;

    private final String swordName;

    private final int strength;

    private int hp;


    public SwordMan(String name, String swordName, int hp, int strength) {
        this.name = name;
        this.swordName = swordName;
        this.strength = strength;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public void decreaseHPBy(int damage) {
        hp = Math.max(0, hp - damage);
    }

    @Override
    public void attack(Fighter otherFighter) {
        // Sword hurts really (+5)  but damage must not exceed strength
        otherFighter.decreaseHPBy(Math.min(strength, random.nextInt(strength + 5)));
    }

    public String getSwordName() {
        return swordName;
    }
}
