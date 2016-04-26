package com.wmora.codegym.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArraysAndStrings8Test {

    @Test
    public void isRotationTest() {
        assertTrue(ArraysAndStrings8.isRotation("erbottlewat", "waterbottle"));
    }

    @Test
    public void isRotationTest2() {
        assertFalse(ArraysAndStrings8.isRotation("erbottlweat", "waterbottle"));
    }

    @Test
    public void isRotationTest3() {
        assertFalse(ArraysAndStrings8.isRotation("erbottlewat", "waterbottl"));
    }
}
