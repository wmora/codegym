package com.wmora.codegym.datastructures.arraysandstrings;

import com.wmora.codegym.datastructures.arraysandstrings.ArraysAndStrings1;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArraysAndStrings1Test {

    @Test
    public void hasAllUniqueCharactersTrue() {
        String input = "qwertyuioplkjhgfdsazxcvbnm";
        assertTrue(ArraysAndStrings1.hasAllUniqueCharacters(input));
    }

    @Test
    public void hasAllUniqueCharactersFalse() {
        String input = "qwertyuioplkjhgfdsazxcvbnn";
        assertFalse(ArraysAndStrings1.hasAllUniqueCharacters(input));
    }

}
