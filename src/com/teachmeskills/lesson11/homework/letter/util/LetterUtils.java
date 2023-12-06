package com.teachmeskills.lesson11.homework.letter.util;

public class LetterUtils {
    public static String duplicateLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }
}
