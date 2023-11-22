package com.qmt.tutorial.fighter;

import java.util.Random;

/**
 * Somebody who fights with bare hands
 */
public class Karateka implements Fighter {

    private static final Random random = new Random();


    private final String specialAttack;

    private final Color kimonoColor;
    private final int strength;
    private final String name;
    private int hp;


    public Karateka(String name, String specialAttack, Color color, int hp, int strength) {
        this.name = name;
        this.specialAttack = specialAttack;
        this.kimonoColor = color;
        this.hp = hp;
        this.strength = strength;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public Color getKimonoColor() {
        return kimonoColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return 0;
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
        otherFighter.decreaseHPBy(random.nextInt(strength + 1));
    }
}
