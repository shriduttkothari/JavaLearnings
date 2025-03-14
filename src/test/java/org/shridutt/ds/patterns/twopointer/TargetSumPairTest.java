package org.shridutt.ds.patterns.twopointer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 *
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
 * Example 1:
 * <p>
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 * Example 2:
 * <p>
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */
class TargetSumPairTest {

    private static TargetSumPair clasUnderTest;

    @BeforeAll
    static void setUp() {
        clasUnderTest = new TargetSumPair();
    }

    @Test
    void case1() {
        assertArrayEquals(new int[]{1, 3}, clasUnderTest.findPairWithSum(new int[]{1, 2, 3, 4, 6}, 6));
    }

    @Test
    void case2() {
        assertArrayEquals(new int[]{0, 2}, clasUnderTest.findPairWithSum(new int[]{2, 5, 9, 11}, 11));
    }

    @Test
    void case3() {
        assertArrayEquals(new int[]{-1, -1}, clasUnderTest.findPairWithSum(new int[]{1,1}, 4));
    }

    @Test
    void case4() {
        assertThrows(IllegalArgumentException.class, () -> clasUnderTest.findPairWithSum(new int[]{}, 4));
    }

    @Test
    void case5() {
        assertThrows(IllegalArgumentException.class, () -> clasUnderTest.findPairWithSum(new int[]{1}, 4));
    }


}