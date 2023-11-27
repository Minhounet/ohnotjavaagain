package com.qmt.tutorial.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LambdaTests {
    @Test
    void test() {
        assertEquals(1, LambdadaOfBrazil.countVowelsWithoutLambdaKnowledge("cerfs", new CountVowelsFunction()));
        assertEquals(1, LambdadaOfBrazil.countVowels("cerfs"));
        assertEquals(3, LambdadaOfBrazil.countVowels("yala"));
        assertEquals(3, LambdadaOfBrazil.countVowelsWithoutLambdaKnowledge("yala",new CountVowelsFunction()));
    }
}
