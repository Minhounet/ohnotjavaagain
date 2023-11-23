package com.qmt.tutorial.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LombokTests {
    @Test
    void test() {
        Weapon weapon = new Weapon("excalibur", 1000);
        Weapon weapon2 = new Weapon("excalibur", 1000);
        Weapon weapon3 = new Weapon("excaliburre", 1001);
        assertEquals(weapon, weapon2);
        assertEquals(weapon.hashCode(),weapon2.hashCode());
        assertNotEquals(weapon, weapon3);
    }
}
