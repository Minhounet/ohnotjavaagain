package com.qmt.tutorial.pojo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class EqualsHashCodeToStringTest {

    @Test
    void CONSTRUCTOR_WITH_NULL_name_EXPECTED_NullPointerException() {
        var e = assertThrows(NullPointerException.class, () -> new EqualsHashCodeToString(null, "description"));
        assertEquals("name cannot be null", e.getMessage());
    }

    @Test
    void CONSTRUCTOR_WITH_NULL_description_EXPECTED_NullPointerException() {
        var e = assertThrows(NullPointerException.class, () -> new EqualsHashCodeToString("name", null));
        assertEquals("description cannot be null", e.getMessage());
    }

    @Test
    void equals_WITH_SAME_OBJECT_EXPECTED_TRUE() {
        var object = new EqualsHashCodeToString("cerfs", "this is a deer");
        var object2 = object;
        assertEquals(object2, object);
    }

    @Test
    void equals_WITH_SAME_characteristics_EXPECTED_TRUE_AND_SAME_hashcode() {
        var animal1 = new EqualsHashCodeToString("cerfs", "this is a deer");
        var animal2 = new EqualsHashCodeToString("cerfs", "this is a deer");
        assertEquals(animal1, animal2);
        assertEquals(animal1.hashCode(), animal2.hashCode());
    }

    @Test
    void equals_WITH_different_characteristics_EXPECTED_false() {
        var animal1 = new EqualsHashCodeToString("cerfs", "this is a deer");
        var animal2 = new EqualsHashCodeToString("worlf", "this is not a deer");
        assertNotEquals(animal1, animal2);
    }

    @Test
    void equals_WITH_different_object_EXPECTED_false() {
        var animal1 = new EqualsHashCodeToString("cerfs", "this is a deer");
        var notAnAnimal = "";
        assertNotEquals(animal1, notAnAnimal);
    }

    @Test
    void hashCode_WITH_identital_objects_EXPECTED_same_hashcode() {
        List<EqualsHashCodeToString> animals = IntStream.range(0, 10)
                .mapToObj(i -> new EqualsHashCodeToString("cerfs", "This is a deer my deer"))
                .toList();
        var firstHashcode = animals.getFirst().hashCode();
        boolean allEqualsToHashcode = animals.stream()
                .map(EqualsHashCodeToString::hashCode)
                .allMatch(a -> firstHashcode == a.hashCode());
        assertTrue(allEqualsToHashcode);
    }

    @Test
    void toString_EXPECTED_PROPER_VALUE() {
        var animal = new EqualsHashCodeToString("cerfs", "this is a super deer");
        assertEquals("[name: 'cerfs', description: 'this is a super deer']", animal.toString());
    }
}