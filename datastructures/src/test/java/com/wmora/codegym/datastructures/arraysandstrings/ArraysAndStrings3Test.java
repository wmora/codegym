package com.wmora.codegym.datastructures.arraysandstrings;

import com.wmora.codegym.datastructures.arraysandstrings.ArraysAndStrings3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStrings3Test {

    @Test
    public void removeDuplicateCharactersTest() {
        assertEquals("abcdefg", ArraysAndStrings3.removeDuplicateCharacters("aabbccddeeffggaabbccddeeffgg"));
    }
}
