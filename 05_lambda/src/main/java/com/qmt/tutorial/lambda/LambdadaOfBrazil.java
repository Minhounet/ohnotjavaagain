package com.qmt.tutorial.lambda;

import lombok.experimental.UtilityClass;

import java.util.function.Function;

@UtilityClass
public class LambdadaOfBrazil {

    // Write this function in lambda style
    private static final Function<String, Integer> COUNT_VOWELS_FUNCTION = null;

    public static int countVowelsWithoutLambdaKnowledge(String word, DunnoJavaLambda<String, Integer> countFunction) {
        return countFunction.apply(word);
    }

    public static int countVowels(String word) {
        return COUNT_VOWELS_FUNCTION.apply(word);
    }
}
