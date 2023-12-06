package com.teachmeskills.lesson11.homework.string.util;

public class StringUtils {
    public static String findShortestWord(String input) {
        String[] words = input.split("\\s+");
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static String findLongestWord(String input) {
        String[] words = input.split("\\s+");
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
