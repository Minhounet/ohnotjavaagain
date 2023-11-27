package com.qmt.tutorial.lambda;

import lombok.experimental.UtilityClass;

import java.util.Optional;
import java.util.function.Function;

@UtilityClass
public class LambdadaOfBrazil {

    // Write this function in lambda style
    // (solution note: this could be a ToInt function)
    private static final Function<String, Integer> COUNT_VOWELS_FUNCTION = word -> {
        var nonNullLoweredCasedWord = Optional.of(word)
                .orElse("")
                .toLowerCase();
        return nonNullLoweredCasedWord
                .chars()
                .map(c -> Vowels.ALL_FRENCH_VOWELS.indexOf(c) != -1 ? 1 : 0)
                .sum();
    };

    public static int countVowelsWithoutLambdaKnowledge(String word, DunnoJavaLambda<String, Integer> countFunction) {
        return countFunction.apply(word);
    }

    public static int countVowels(String word) {
        return COUNT_VOWELS_FUNCTION.apply(word);
    }
}
