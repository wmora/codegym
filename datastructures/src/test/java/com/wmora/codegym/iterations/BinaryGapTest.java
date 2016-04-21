package com.wmora.codegym.iterations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void doBefore() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void binaryGapTest1() {
        assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void binaryGapTest2() {
        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void binaryGapTest3() {
        assertEquals(5, binaryGap.solution(1041));
    }

    @Test
    public void binaryGapTest4() {
        assertEquals(0, binaryGap.solution(15));
    }

}
