package com.qmt.tutorial.fighter;

/**
 * Wanna fight ? This is the right interface for !
 */
public interface Fighter {

    String getName();

    int getStrength();

    int getHP();

    void decreaseHPBy(int damage);

    /**
     * Hit the other fighter and decrease other {@link Fighter} HP when damage cannot exceed strength
     *
     * @param otherFighter the {@link Fighter} to attack
     */
    void attack(Fighter otherFighter);
}
