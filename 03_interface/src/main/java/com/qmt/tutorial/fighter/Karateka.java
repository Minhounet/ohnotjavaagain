package com.qmt.tutorial.fighter;

/**
 * Somebody who fights with bare hands
 */
public class Karateka {

    private final String specialAttack;
    private final Color kimonoColor;
    private final int strength;
    private final String name;
    private final int hp;

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

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
