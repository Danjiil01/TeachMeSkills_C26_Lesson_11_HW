package com.teachmeskills.lesson11.homework.document.util;

public class DocumentUtils {
    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.print(blocks[0] + " ");
        System.out.println(blocks[2]);
    }

    public static void maskLetterBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder maskedNumber = new StringBuilder();
        for (String block : blocks) {
            if (block.length() == 3 && block.matches("[A-Za-z]+")) {
                maskedNumber.append("***");
            } else {
                maskedNumber.append(block);
            }
            maskedNumber.append("-");
        }
        maskedNumber.deleteCharAt(maskedNumber.length() - 1); // Удаляем лишний "-"
        System.out.println(maskedNumber);
    }

    public static void extractLowercaseLetters(String documentNumber) {
        String[] parts = documentNumber.split("-");
        StringBuilder lowResult = new StringBuilder();

        for (String part : parts) {
            for (char c : part.toCharArray()) {
                if (Character.isLetter(c)) {
                    lowResult.append(Character.toLowerCase(c));
                }
            }
            lowResult.append("/");
        }

        lowResult.deleteCharAt(lowResult.length() - 1);
        System.out.println(lowResult);
    }

    public static void extractUppercaseLetters(String documentNumber) {
        String[] parts = documentNumber.split("-");
        StringBuilder upResult = new StringBuilder("Letters:");

        for (String part : parts) {
            for (char c : part.toCharArray()) {
                if (Character.isLetter(c)) {
                    upResult.append(Character.toUpperCase(c));
                }
            }
            upResult.append("/");
        }

        upResult.deleteCharAt(upResult.length() - 1);
        System.out.println(upResult);
    }

    public static void checkForAbcSequence(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность 'abc'");
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc'");
        }
    }

    public static void checkStartsWithSequence(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с последовательности '555'");
        } else {
            System.out.println("Номер документа не начинается с последовательности '555'");
        }
    }

    public static void checkEndsWithSequence(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на последовательность '1a2b'");
        } else {
            System.out.println("Номер документа не заканчивается на последовательность '1a2b'");
        }
    }

}
