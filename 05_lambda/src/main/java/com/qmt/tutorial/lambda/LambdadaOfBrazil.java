package com.qmt.tutorial.lambda;

import lombok.experimental.UtilityClass;

import java.util.function.Function;

@UtilityClass
public class LambdadaOfBrazil {

    // Write this function in lambda style
    private static Function<String, Integer> countVowelsFunction = null;

    public static int countVowelsWithoutLambdaKnowledge(String word, DunnoJavaLambda<String, Integer> countFunction) {
        return countFunction.apply(word);
    }

    public static int countVowels(String word) {
        return countVowelsFunction.apply(word);
    }
}
