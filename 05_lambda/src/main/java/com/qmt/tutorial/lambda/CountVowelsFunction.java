package com.qmt.tutorial.lambda;

import java.util.Optional;

/**
 * Count all vowels (we assume that "y" even if it is not true in English).
 */
public class CountVowelsFunction implements DunnoJavaLambda<String, Integer> {

    @Override
    public Integer apply(String source) {
        var nonNullWord = Optional.of(source)
                .orElse("")
                .toLowerCase();
        return nonNullWord
                .chars()
                .map(c -> Vowels.ALL_FRENCH_VOWELS.indexOf(c) != -1 ? 1 : 0)
                .sum();
    }
}
