package com.wmora.codegym.datastructures;

/**
 * Remove the duplicate characters in a string without using any additional buffer
 */
class ArraysAndStrings3 {

    static String removeDuplicateCharacters(String string) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (out.toString().indexOf(string.charAt(i)) < 0) {
                out.append(string.charAt(i));
            }
        }
        return out.toString();
    }

}
