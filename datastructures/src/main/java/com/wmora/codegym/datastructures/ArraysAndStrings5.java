package com.wmora.codegym.datastructures;

class ArraysAndStrings5 {

    static String encode(String string) {
        return string.replaceAll(" ", "%20");
    }

    static String encode2(String string) {
        while (string.contains(" ")) {
            int index = string.indexOf(" ");
            string = string.substring(0, index) + "%20" + string.substring(index + 1);
        }
        return string;
    }

}
