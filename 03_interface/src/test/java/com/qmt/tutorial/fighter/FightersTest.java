package com.qmt.tutorial.fighter;

import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FightersTest {

    @Test
    void testImplementations() {
        Reflections reflections = new Reflections("com.qmt.tutorial.fighter");
        Set<Class<? extends Fighter>> subtypes = reflections.getSubTypesOf(Fighter.class);
        assertEquals(Set.of(Karateka.class, SwordMan.class), subtypes);
    }

    @Test
    void testAttacks() {
        Fighter karateka = new Karateka("Ryu", "hadoken", Color.WHITE, 100, 10);
        var differentValueCount = IntStream.range(0, 10000).mapToObj(ignored -> {
                    Fighter victim = new SwordMan("victim", "aie aie aie", 100, 30);
                    karateka.attack(victim);
                    return victim.getHP();
                }).distinct()
                .count();
        assertNotEquals(1, differentValueCount);
    }

    @Test
    void testHp() {
        Fighter ryu = new Karateka("Ryu", "hadoken", Color.WHITE, 100, 10);
        Fighter dyingKen = new Karateka("Ken", "shoryuken", Color.WHITE, 1, 10);
        ryu.attack(dyingKen);
        ryu.attack(dyingKen);
        ryu.attack(dyingKen);
        assertEquals(0, dyingKen.getHP());
    }
}
