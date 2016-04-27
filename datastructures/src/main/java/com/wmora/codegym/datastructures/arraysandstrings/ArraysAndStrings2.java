package com.wmora.codegym.datastructures.arraysandstrings;

/**
 * Write code to reverse a C-Style String (C-String means that “abcd” is represented as  ve characters, including
 * the null character )
 */
class ArraysAndStrings2 {

    static String reverseCString(String cString) {
        String[] chars = cString.split("");
        for (int i = 0; i < (cString.length() - 1) / 2; i++) {
            chars[i] += chars[cString.length() - 2 - i];
            chars[cString.length() - 2 - i] = String.valueOf(chars[i].charAt(0));
            chars[i] = String.valueOf(chars[i].charAt(1));
        }
        return String.join("", (CharSequence[]) chars);
    }

    static String reverseCString2(String cString) {
        StringBuilder buffer = new StringBuilder();
        for (int i = cString.length() - 2; i >= 0; i--) {
            buffer.append(cString.charAt(i));
        }
        buffer.append(cString.charAt(cString.length() - 1));
        return buffer.toString();
    }

}
