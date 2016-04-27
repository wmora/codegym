package com.wmora.codegym.datastructures.arraysandstrings;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
 */
class ArraysAndStrings7 {
    static int[][] cleanMatrix(int[][] matrix) {
        boolean[][] cleaned = new boolean[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0 && !cleaned[row][column]) {
                    cleanRowAndColumn(matrix, row, column, cleaned);
                }
            }
        }

        return matrix;
    }

    private static void cleanRowAndColumn(int[][] matrix, int row, int column, boolean[][] cleaned) {
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = 0;
                cleaned[row][i] = true;
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][column] != 0) {
                matrix[j][column] = 0;
                cleaned[j][column] = true;
            }
        }
    }
}
