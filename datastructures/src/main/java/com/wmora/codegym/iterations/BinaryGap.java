package com.wmora.codegym.iterations;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has
 * binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number
 * 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation
 * 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * int solution(int N);
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0
 * if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and
 * so its longest binary gap is of length 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(log(N));
 * expected worst-case space complexity is O(1).
 */
class BinaryGap {

    int solution(int n) {
        String binaryNumber = Integer.toString(n, 2);

        int longestBinaryGap = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            if (String.valueOf(binaryNumber.charAt(i)).equals("1")) {
                int nextOne = binaryNumber.indexOf("1", i + 1);

                if (nextOne < 0) {
                    return longestBinaryGap;
                }
                int binaryGap = nextOne - (i + 1);
                longestBinaryGap = longestBinaryGap < binaryGap ? binaryGap : longestBinaryGap;
            }

        }

        return longestBinaryGap;
    }

}
