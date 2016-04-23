package com.wmora.codegym.datastructures;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not
 */
class ArraysAndStrings4 {

    static boolean areAnagrams(String a, String b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        }
        return sort(a.toLowerCase()).equals(sort(b.toLowerCase()));
    }

    private static String sort(String string) {
        char[] array = string.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

}
