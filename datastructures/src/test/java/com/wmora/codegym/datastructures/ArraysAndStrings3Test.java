package com.wmora.codegym.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStrings3Test {

    @Test
    public void removeDuplicateCharactersTest() {
        assertEquals("abcdefg", ArraysAndStrings3.removeDuplicateCharacters("aabbccddeeffggaabbccddeeffgg"));
    }
}
