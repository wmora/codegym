package com.wmora.codegym.datastructures;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ArraysAndStrings7Test {

    @Test
    public void cleanMatrixTest() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 9, 0}, {5, 3, 2, 4}, {1, 1, 1, 1}};
        int[][] expected = new int[][]{{1, 0, 3, 0}, {5, 0, 7, 0}, {0, 0, 0, 0}, {5, 0, 2, 0}, {1, 0, 1, 0}};

        int[][] actual = ArraysAndStrings7.cleanMatrix(matrix);

        for (int i = 0; i < actual.length; i++) {
            assertTrue(Arrays.equals(expected[i], actual[i]));
        }
    }
}
