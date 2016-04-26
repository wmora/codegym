package com.wmora.codegym.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysAndStrings5Test {

    @Test
    public void encodeTest() {
        assertEquals("%20%20%20", ArraysAndStrings5.encode("   "));
        assertEquals("%20a%20", ArraysAndStrings5.encode(" a "));
        assertEquals("abc", ArraysAndStrings5.encode("abc"));
    }

    @Test
    public void encode2Test() {
        assertEquals("%20%20%20", ArraysAndStrings5.encode2("   "));
        assertEquals("%20a%20", ArraysAndStrings5.encode2(" a "));
        assertEquals("abc", ArraysAndStrings5.encode2("abc"));
    }
}
