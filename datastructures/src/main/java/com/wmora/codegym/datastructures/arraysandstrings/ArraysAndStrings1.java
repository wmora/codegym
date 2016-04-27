package com.wmora.codegym.datastructures.arraysandstrings;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
class ArraysAndStrings1 {

    static boolean hasAllUniqueCharacters(String string) {
        int stringLength = string.length();

        for (int i = 0; i < stringLength - 1; i++) {
            if (string.indexOf(string.charAt(i), i + 1) > -1) {
                return false;
            }
        }

        return true;
    }

}
