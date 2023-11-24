package com.qmt.tutorial.pojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void validate_Boss_Pojo() {
        Boss boss = new Boss("Sephiroth", 27);
        assertEquals("Sephiroth", boss.getName());
        assertEquals(27, boss.getAge());

        Boss peppa = new Boss();
        peppa.setAge(3);
        peppa.setName("Peppa");
        assertEquals(3, peppa.getAge());
        assertEquals("Peppa", peppa.getName());
    }

    @Test
    void isAdultInFrance_WITH_value_27_EXPECTED_TRUE() {
        Boss boss = new Boss("Sephiroth", 27);
        assertTrue(boss.isAdultInFrance());
    }

    @Test
    void isAdultInFrance_WITH_value_10_EXPECTED_FALSE() {
        Boss boss = new Boss("Child", 10);
        assertFalse(boss.isAdultInFrance());
    }
}
