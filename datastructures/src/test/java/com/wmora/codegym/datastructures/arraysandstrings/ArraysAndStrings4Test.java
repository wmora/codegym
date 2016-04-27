package com.wmora.codegym.datastructures.arraysandstrings;

import org.junit.Test;

import static com.wmora.codegym.datastructures.arraysandstrings.ArraysAndStrings4.areAnagrams;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArraysAndStrings4Test {

    @Test
    public void areAnagramsTest1() {
        assertTrue(areAnagrams("cinema", "iceman"));
    }

    @Test
    public void areAnagramsTest2() {
        assertFalse(areAnagrams("yahoo", "google"));
    }

    @Test
    public void areAnagramsTest3() {
        assertTrue(areAnagrams(null, null));
    }

    @Test
    public void areAnagramsTest4() {
        assertFalse(areAnagrams(null, "google"));
    }

    @Test
    public void areAnagramsTest5() {
        assertTrue(areAnagrams("CINEma", "iceMAn"));
    }

}
