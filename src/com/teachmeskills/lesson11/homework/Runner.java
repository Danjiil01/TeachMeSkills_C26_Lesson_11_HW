package com.teachmeskills.lesson11.homework;

import static com.teachmeskills.lesson11.homework.document.util.DocumentUtils.*;
import static com.teachmeskills.lesson11.homework.string.util.StringUtils.*;
import static com.teachmeskills.lesson11.homework.letter.util.LetterUtils.*;

public class Runner {
    public static void main(String[] args) {
        String documentNumber = "9814-YhB-0990-aBc-1a2b";

        printFirstTwoBlocks(documentNumber);
        maskLetterBlocks(documentNumber);
        extractLowercaseLetters(documentNumber);
        extractUppercaseLetters(documentNumber);
        checkForAbcSequence(documentNumber);
        checkStartsWithSequence(documentNumber);
        checkEndsWithSequence(documentNumber);

        System.out.println();

        String mainPhrase = "Java language is fascinating";

        String str1 = findLongestWord(mainPhrase);
        System.out.println(str1);

        String str2 = findShortestWord(mainPhrase);
        System.out.println(str2);

        String str3 = duplicateLetters(mainPhrase);
        System.out.println(str3);
    }
}
