package com.wmora.codegym.datastructures.arraysandstrings;

/**
 * Given two strings s1 and s2, write code to check if s2 is a rotation of s1 using only one call to contains()
 */
class ArraysAndStrings8 {

    static boolean isRotation(String s1, String s2) {
        if (s2.length() != s1.length()) {
            return false;
        }
        s1 += s1;
        return s1.contains(s2);
    }

}
