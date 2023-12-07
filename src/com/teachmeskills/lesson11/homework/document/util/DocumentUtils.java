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
        String[] block = documentNumber.toLowerCase().split("-");
        for (int i = 1; i < block.length; i=i+2){
            System.out.print(block[i]+"/");
        }
        System.out.println(documentNumber.toLowerCase().charAt(19)+"/"+documentNumber.toLowerCase().charAt(21));
    }

    public static void extractUppercaseLetters(String documentNumber) {

        StringBuilder result = new StringBuilder("Letters: ");
        String[] block = documentNumber.toUpperCase().split("-");

        for (int i = 1; i < block.length; i = i + 2) {
            result.append(block[i]).append("/");
        }

        result.append(documentNumber.toUpperCase().charAt(19)).append("/")
                .append(documentNumber.toUpperCase().charAt(21));

        System.out.println(result);
    }

    public static void checkForAbcSequence(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Document number involves this sequence: 'abc'");
        } else {
            System.out.println("Document number doesn`t involve this sequence: 'abc'");
        }
    }

    public static void checkStartsWithSequence(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with '555'");
        } else {
            System.out.println("Document number doesn`t start with '555'");
        }
    }

    public static void checkEndsWithSequence(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with '1a2b'");
        } else {
            System.out.println("Document number doesn`t end with '1a2b'");
        }
    }

}
