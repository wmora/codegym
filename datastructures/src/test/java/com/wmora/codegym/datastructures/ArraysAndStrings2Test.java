package com.wmora.codegym.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStrings2Test {

    private StringBuilder longString;

    @Before
    public void doBefore() {
        longString = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            longString.append("e");
        }
    }

    @Test
    public void reverseCStringTest1() {
        String input = "abcd\0";
        String expected = "dcba\0";
        assertEquals(expected, ArraysAndStrings2.reverseCString(input));
    }

    @Test
    public void reverseCStringTest2() {
        String input = longString.toString() + "\0";
        String expected = longString.reverse().append("\0").toString();
        assertEquals(expected, ArraysAndStrings2.reverseCString(input));
    }

    @Test
    public void reverseCStringTest3() {
        String input = "abcd\0";
        String expected = "dcba\0";
        assertEquals(expected, ArraysAndStrings2.reverseCString2(input));
    }

    @Test
    public void reverseCStringTest4() {
        String input = longString.toString() + "\0";
        String expected = longString.reverse().append("\0").toString();
        assertEquals(expected, ArraysAndStrings2.reverseCString2(input));
    }

}
