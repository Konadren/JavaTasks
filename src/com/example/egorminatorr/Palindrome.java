package com.example.egorminatorr;


/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */

public class Palindrome {
    public static void main(String[] args) {
        String str = "Наворован";

        if (isPalindrome(str)) System.out.println("Yes");
        else System.out.println("No");

    }

    public static boolean isPalindrome(String str){
        boolean isPalindrome = false;

        /**
         * Палиндромы -- слова с нечетным количеством символов
         *
         * Можем делить строку на части и сравнивать их содержимое
         * True -- палиндром, False -- не палиндром
         *
         */

        StringBuilder partOne = new StringBuilder();
        StringBuilder partTwo = new StringBuilder();

        halfSplit(str, partOne, partTwo);

        StringBuilder reversedStr = partTwo.reverse();

        if (partOne.compareTo(reversedStr) == 0) isPalindrome = true;
        return isPalindrome;
    }

    private static void halfSplit(String str, StringBuilder partOne, StringBuilder partTwo) {
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() / 2) partOne.append(str.toLowerCase().charAt(i));
            if (i >= str.length() / 2) partTwo.append(str.toLowerCase().charAt(i));
        }
    }
}
